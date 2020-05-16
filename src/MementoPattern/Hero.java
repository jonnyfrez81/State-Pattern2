package MementoPattern;

public class Hero {

    public String name;
    public Boolean power;
    public int health;

    public Hero(String name, Boolean power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public HeroState setState(){
        return new HeroState(name, power, health);
    }

    public void restore(HeroState state){
        name = state.name;
        power = state.power;
        health = state.health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", health=" + health +
                '}';
    }
}
