package com.nhnacademy.mart;

import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    BuyList buyList = new BuyList();

    void buyListInit() {
        buyList.add(new BuyList.Item("양파", 2));
        buyList.add(new BuyList.Item("계란", 2));
        buyList.add(new BuyList.Item("사과", 1));
    }

    void buyListInitMod() {
        buyList.add(new BuyList.Item("양파", 2));
        buyList.add(new BuyList.Item("계란", 2));
        buyList.add(new BuyList.Item("피클", 1));
    }

    FoodStand foodStand = new FoodStand();

    void fillFoodStand() {
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
    @DisplayName("FoodStand에 있는 항목 Basket에 추가 성공")
    void CustomerPickFoods_o() {

        fillFoodStand();
        buyListInit();
        Customer customer = new Customer(buyList);
        customer.bring(new Basket());
        customer.pickFoods(foodStand);
    }

    @Test
    @DisplayName("FoodStand에 없는 항목 Basket에 추가 실패")
    void CustomerPickFoods_x() {

        fillFoodStand();
        buyListInitMod();
        Customer customer = new Customer(buyList);
        customer.bring(new Basket());
        try {
            customer.pickFoods(foodStand);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}