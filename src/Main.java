import MementoPattern.Hero;
import MementoPattern.HeroState;
import MementoPattern.History;

public class Main {

    public static void main(String[] args){

        var hero = new Hero("Mario1", true, 33);
        var hero1 = new Hero("Mario2", true, 33);
        var hero2 = new Hero("Mario3", true, 33);
        var hero3 = new Hero("Mario4", true, 33);
        var history = new History();

        history.push(hero.setState());
        history.push(hero1.setState());
        history.push(hero2.setState());
        history.push(hero3.setState());
        hero.restore(history.pop());
        hero.restore(history.pop());

        System.out.println(hero.toString());

    }
    }

