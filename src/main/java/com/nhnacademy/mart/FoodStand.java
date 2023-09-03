package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    //    public FoodStand(){};
    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void add(Food food) {
        foods.add(food);
    }
    // TODO add 메서드 구현

    public void delete(String foodName) {
        for (int i = 0; i < getFoods().size(); i++) {
            if (getFoods().get(i).getName().equals(foodName)) {
                getFoods().remove(i);
                return;
            }
        }
        throw new IllegalArgumentException(foodName + "(은)는 수량이 없거나, 취급하지 않습니다.");
    }
    // TODO 장바구니에 담은 Food 삭제 구현

}
