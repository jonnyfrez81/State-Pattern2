package Memento2;

public class Main {

    public static void main(String[] args){
        var patient = new Patient("X", 33, true);
        var patient1 = new Patient("A", 33, true);
        var history = new History();

        history.push(patient.crateState());
        history.push(patient1.crateState());

        patient.getPatient(history.pop());
        patient.getPatient(history.pop());

        System.out.println(patient.toString());
    }
}
