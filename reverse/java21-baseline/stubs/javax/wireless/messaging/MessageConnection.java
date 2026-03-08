package javax.wireless.messaging;

import java.io.IOException;
import java.io.InterruptedIOException;

public interface MessageConnection {
    void close() throws IOException;

    Message newMessage(String type);

    Message newMessage(String type, String address);

    int numberOfSegments(Message message);

    Message receive() throws IOException, InterruptedIOException;

    void send(Message message) throws IOException, InterruptedIOException;

    void setMessageListener(MessageListener messageListener) throws IOException;
}
