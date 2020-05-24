public class Transit implements ITransport {

    private int value = 0;
    private String transport = "Transit";

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String transportMethod() {
        return transport;
    }
}
