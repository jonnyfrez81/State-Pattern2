package Memento2;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<PatientState> state = new ArrayList<>();

    public void push(PatientState patient){
        state.add(patient);
    }

    public PatientState pop(){
        int index = state.size() -1;
        var patient = state.get(index);

        if(index > 0)
            state.remove(index);

        return patient;

    }
}
