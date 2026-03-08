import java.util.Arrays;
import java.util.Date;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.TextMessage;

public final class XMessage implements TextMessage, BinaryMessage {
    private String payloadText = "";
    private String address = "";
    private byte[] payloadData = new byte[0];

    @Override
    public String getPayloadText() {
        return payloadText;
    }

    @Override
    public void setPayloadText(String value) {
        payloadText = value;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String value) {
        address = value;
    }

    @Override
    public Date getTimestamp() {
        return new Date(0L);
    }

    @Override
    public byte[] getPayloadData() {
        return Arrays.copyOf(payloadData, payloadData.length);
    }

    @Override
    public void setPayloadData(byte[] value) {
        payloadData = value == null ? new byte[0] : Arrays.copyOf(value, value.length);
    }
}
