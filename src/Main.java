public class Main {

    public static void main(String[] args) {
        var ETA = new DirectionService();

        ETA.setTransportation(new Car());
        ETA.setValues();
        System.out.println(ETA.toString());

        ETA.setTransportation(new Transit());
        ETA.setValues();
        System.out.println(ETA.toString());

        ETA.setTransportation(new Walking());
        ETA.setValues();
        System.out.println(ETA.toString());

    }
}
