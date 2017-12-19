package rabbitmq.routing;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

public class EmitLogDirect {

    private static final String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] args) throws IOException {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "direct");

        String severity = getSeverity(args);
        String message = getMessage(args);

        channel.basicPublish(EXCHANGE_NAME, severity, null, message.getBytes());

        channel.close();
        connection.close();
    }

    private static String getSeverity(String[] strings){
        if (strings.length < 1)
            return "info";
        return strings[0];
    }

    private static String getMessage(String[] strings){
        if(strings.length < 1) return "Hello world";

        return joinStrings(strings, " ", 1);
    }

    private static String joinStrings(String[] strings, String delimiter, int startIndex) {
        int length = strings.length;

        if (length == 0) return "";

        if (length < startIndex) return "";

        StringBuilder words = new StringBuilder(strings[startIndex]);
        for (int i = startIndex + 1; i < length; i++) {
            words.append(delimiter).append(strings[i]);
        }

        return words.toString();
    }
}
