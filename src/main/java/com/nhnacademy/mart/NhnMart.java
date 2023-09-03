package com.nhnacademy.mart;

public class NhnMart {

    public static int ONION_PRICE = 1_000;
    public static int EGG_PRICE = 5_000;
    public static int GREEN_ONION_PRICE = 500;
    public static int APPLE_PRICE = 2_000;
    private final FoodStand foodStand = new FoodStand();

    public void prepareMart() {
        fillFoodStand();
    }

    // 음식 세팅
    private void fillFoodStand() {
        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1_000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5_000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2_000));
        }
    }


    public Basket provideBasket() {
        return new Basket();
    }

    public FoodStand getFoodStand() {
        return foodStand;
    }

    public Counter getCounter() {
        return new Counter();
    }


}
