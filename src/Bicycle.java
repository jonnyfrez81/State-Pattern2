public class Bicycle implements ITransport {

    private int value = 2;
    private String transport = "Bicycle";

    public Bicycle(int value, String transport) {
        this.value = value;
        this.transport = transport;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String transportMethod() {
        return transport;
    }
}
