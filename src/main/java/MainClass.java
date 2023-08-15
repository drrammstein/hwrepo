package main.java;

import static main.java.Feeding.feed;
import static main.java.FoodPlate.foodAdd;

public class MainClass {

    public static void main(String[] args) {
        /*run(new main.java.Cat("Мурзик"), 50);
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
        swim(new main.java.Dog("Бобик"), 11);*/

        main.java.FoodPlate plate = new main.java.FoodPlate();
        main.java.Cat cat1 = new main.java.Cat("Мурзик", 50);
        main.java.Cat cat2 = new main.java.Cat("Барсик", 70);
        main.java.Cat cat3 = new main.java.Cat("Пушок", 90);

        main.java.Cat[] catsArray = new main.java.Cat[]{cat1, cat2, cat3};

        feed(plate, catsArray);
        foodAdd(150);
        feed(plate, catsArray);
        foodAdd(130);
        feed(plate, catsArray);
        System.out.println("Количество котов на кормёжке: " + catsArray.length);

    }

}
