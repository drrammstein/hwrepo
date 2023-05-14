package main.java;

public class Animal {
    protected int barrierLength;

    protected static void run(Animal animal, int barrierLength) {
        if (animal instanceof main.java.Cat && barrierLength > main.java.Cat.maxRunRange) {
            System.out.println("Кот " + animal + " столько не бегает.");
        } else if (animal instanceof main.java.Cat && barrierLength <= main.java.Cat.maxRunRange) {
            System.out.println("Кот " + animal + " пробежал " + barrierLength + " метров.");
        }

        if (animal instanceof main.java.Dog && barrierLength > main.java.Dog.maxRunRange) {
            System.out.println("Собака " + animal + " столько не бегает.");
        } else if (animal instanceof main.java.Dog && barrierLength <= main.java.Dog.maxRunRange) {
            System.out.println("Собака " + animal + " пробежала " + barrierLength + " метров.");
        }

    }

    protected static void swim(Animal animal, int barrierLength) {
        if (animal instanceof main.java.Cat) {
            System.out.println("Кот " + animal + " отказался плавать и убежал.");
        }

        if (animal instanceof main.java.Dog && barrierLength > main.java.Dog.maxSwimRange) {
            System.out.println("Собака " + animal + " столько не плавает.");
        } else if (animal instanceof main.java.Dog && barrierLength <= main.java.Dog.maxSwimRange) {
            System.out.println("Собака " + animal + " проплыла " + barrierLength + " метров.");
        }
    }
}
