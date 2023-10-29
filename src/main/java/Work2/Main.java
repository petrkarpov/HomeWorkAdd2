package Work2;

import Work2.Animal;
import Work2.Cat;
import Work2.Duck;
import Work2.Fish;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal duck = new Duck();
        Animal fish = new Fish();

        cat.move();
        duck.move();
        fish.move();
    }
}
