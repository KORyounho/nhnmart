package com.nhnacademy.mart;

public class Counter {

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public void pay(int totalPrice, int hasMoney) {
        if (totalPrice <= hasMoney) {
            System.out.println("총 가격은 " + totalPrice + " 입니다.");
            System.out.println("고객님 결제 후 잔액 : " + (hasMoney - totalPrice));
        } else {
            throw new IllegalArgumentException("결제 금액이 보유하신 금액에 초과하였습니다.");
        }
    }
}
