package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<HeroState> state = new ArrayList<>();

    public void push(HeroState hero){
        state.add(hero);
    }

    public HeroState pop(){
        int index = state.size() -1;
        var hero = state.get(index);
        if(index > 0)
            state.remove(index);

        return hero;
    }
}
