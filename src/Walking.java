public class Walking implements ITransport{

    private int value = 4;
    private String transport = "Walking";

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String transportMethod() {
        return transport;
    }
}
