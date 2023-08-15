package main.java;

public class Cat extends main.java.Animal {
    String name;
    static int maxRunRange = 200;
    private int hunger;

    public boolean isFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    private boolean fullness;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getMaxRunRange() {
        return maxRunRange;
    }


    protected Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }
}
