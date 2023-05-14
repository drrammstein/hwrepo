package main.java;

public class Dog extends main.java.Animal {
    String name;
    static int maxRunRange = 500;
    static int maxSwimRange = 10;
    @Override
    public String toString() {
        return name;
    }

    public static int getMaxRunRange() {
        return maxRunRange;
    }

    public static int getMaxSwimRange() {
        return maxSwimRange;
    }

    protected Dog(String name) {
        this.name=name;
    }
}
