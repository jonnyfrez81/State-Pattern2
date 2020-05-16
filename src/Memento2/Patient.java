package Memento2;

public class Patient {

    public String name;
    public int age;
    public boolean corona;

    public Patient(String name, int age, boolean corona) {
        this.name = name;
        this.age = age;
        this.corona = corona;
    }


    public PatientState crateState(){
        return new PatientState(name, age, corona);
    }

    public void getPatient(PatientState state){
        name = state.name;
        age = state.age;
        corona = state.corona;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", corona=" + corona +
                '}';
    }
}
