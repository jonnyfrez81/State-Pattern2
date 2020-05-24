public class Car implements ITransport{

    private int value = 1;
    private String transport = "Car";

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String transportMethod() {
        return transport;
    }
}
