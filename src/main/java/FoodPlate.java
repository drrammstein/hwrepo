package main.java;

public class FoodPlate {

    private static int foodAmount = 100;

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public static void foodAdd(int foodAddAmount) {
        foodAmount = foodAmount + foodAddAmount;
        System.out.println("В тарелку добавлено " + foodAddAmount + " еды. Текущее количество еды в тарелке: " + foodAmount);
    }

}
