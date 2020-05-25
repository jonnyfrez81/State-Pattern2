public class DirectionService {

    private int calculate = 0;
    private String transport;
    private ITransport transportation;

    public void setTransportation(ITransport currentTransportation){this.transportation = currentTransportation;}
    public void setValues(){
        this.calculate = transportation.getValue();
        this.transport = transportation.transportMethod();
    }

    @Override
    public String toString() {
        return
                "calculate=" + calculate +
                " transport=" + transport;
    }
}
