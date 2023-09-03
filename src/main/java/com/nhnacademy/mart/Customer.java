package com.nhnacademy.mart;

import java.util.ArrayList;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    private final int hasMoney = 20_000;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {

        int count = 0;
        for (BuyList.Item buylist : buyList.getItems()) {
            boolean bol = false;
            for (int i = 0; i < buylist.getAmount(); i++) {
                for (Food food : foodStand.getFoods()) {
                    if (buylist.getName().equals(food.getName())) {
                        bol = true;
                        basket.add(food);
                        foodStand.delete(food.getName());
                        count++;
                        break;
                    }
                }
                if (!bol) {
                    throw new IllegalArgumentException(buylist.getName() + " (은)는 찾을 수 없는 항목입니다.");
                }
            }
            // butlist의 getmount만큼 돌고,
            //도는 횟수만큼 basket에 add하는 로직임.
            //지금 하다 만 곳은, 스탠드푸드에 같은 값이 있으면 그 값을 bastket에 넣고
            //그 경우가 아니라면 예외를 던질거임.
            // TODO 메서드 나머지 구현
        }
    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {
        int totalPrice = 0;
//        for(int i = 0; i<basket.getFoods().size(); i++){
//            totalPrice += basket.getFoods().get(i).getPrice();
//        }
        for (Food food : basket.getFoods()) {
            totalPrice += food.getPrice();
        }
        counter.pay(totalPrice, hasMoney);
    }
}
