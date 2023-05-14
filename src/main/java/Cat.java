package main.java;

public class Cat extends main.java.Animal {
    String name;
    static int maxRunRange = 200;

    @Override
    public String toString() {
        return name;
    }

    public int getMaxRunRange() {
        return maxRunRange;
    }


    protected Cat(String name) {
        this.name=name;
    }
}
