package main.java;

public class Feeding {
    public static void feed(main.java.FoodPlate foodPlate, main.java.Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {

            if (cats[i].isFullness()) {
                System.out.println("Кот " + cats[i].name + " сыт.");
                continue;
            }

            if (foodPlate.getFoodAmount() > cats[i].getHunger()) {
                foodPlate.setFoodAmount(foodPlate.getFoodAmount() - cats[i].getHunger());
                cats[i].setFullness(true);
                System.out.println("Кот " + cats[i].name + " съел " + cats[i].getHunger() + " еды. В тарелке осталось " + foodPlate.getFoodAmount() + " еды.");
            } else {
                System.out.println(cats[i].name + " не поел. В тарелке недостаточно еды. (" + foodPlate.getFoodAmount() + ")");
            }
        }
    }
}
