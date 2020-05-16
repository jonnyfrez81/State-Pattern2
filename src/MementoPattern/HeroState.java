package MementoPattern;

public class HeroState {

    public final String name;
    public final Boolean power;
    public final int health;

    public HeroState(String name, Boolean power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public HeroState create(){
        return new HeroState(this.name,this.power, this.health);
    }

    @Override
    public String toString() {
        return "HeroState{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", health=" + health +
                '}';
    }
}
