package Memento2;

public class PatientState {

    public final String name;
    public final int age;
    public final boolean corona;

    public PatientState(String name, int age, boolean corona) {
        this.name = name;
        this.age = age;
        this.corona = corona;
    }
}
