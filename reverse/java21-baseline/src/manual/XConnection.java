import java.io.IOException;
import java.io.InterruptedIOException;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.MessageListener;

public final class XConnection implements MessageConnection {
    @Override
    public void close() throws IOException {
    }

    @Override
    public Message newMessage(String type) {
        return new XMessage();
    }

    @Override
    public Message newMessage(String type, String address) {
        XMessage message = new XMessage();
        message.setAddress(address);
        return message;
    }

    @Override
    public int numberOfSegments(Message message) {
        return 1;
    }

    @Override
    public Message receive() throws IOException, InterruptedIOException {
        return new XMessage();
    }

    @Override
    public void send(Message message) throws IOException, InterruptedIOException {
    }

    @Override
    public void setMessageListener(MessageListener messageListener) throws IOException {
    }
}
