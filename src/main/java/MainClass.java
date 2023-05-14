package main.java;

import static main.java.Animal.run;
import static main.java.Animal.swim;

public class MainClass {

    public static void main(String[] args) {
        run(new main.java.Cat("Мурзик"), 50);
        run(new main.java.Cat("Барсик"), 150);
        run(new main.java.Cat("Пушок"), 500);

        run(new main.java.Dog("Тузик"), 50);
        run(new main.java.Dog("Шарик"), 250);
        run(new main.java.Dog("Бобик"), 600);

        swim(new main.java.Cat("Мурзик"), 5);
        swim(new main.java.Cat("Барсик"), 9);
        swim(new main.java.Cat("Пушок"), 0);

        swim(new main.java.Dog("Тузик"), 5);
        swim(new main.java.Dog("Шарик"), 9);
        swim(new main.java.Dog("Бобик"), 11);
    }

}
