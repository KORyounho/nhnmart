package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodStandTest {
    FoodStand foodStand = new FoodStand();

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

    @Test
    @DisplayName("FoodStand의 목록에 있는 물품 제거")
    void FoodStandDelete_o() {
        fillFoodStand();
        Assertions.assertTrue(() -> {
            for (int i = 0; i < 2; i++) {
                foodStand.delete("양파");
            }
            return true;
        });
    }

    @Test
    @DisplayName("FoodStand의 목록에 없는 물품 제거시, IlltagalArgumentException 에러")
    void FoodStandDelete_x() {
        fillFoodStand();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            for (int i = 0; i < 3; i++) {
                foodStand.delete("양파");
            }
        });
    }
}
