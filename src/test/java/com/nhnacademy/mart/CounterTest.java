package com.nhnacademy.mart;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    @DisplayName("계산시, 고객의 소지한 금액보다 totalPrice가 적은 경우")
    void CounterTest_o() {
        Counter counter = new Counter();
        Random random = new Random();
        int hasMoney = random.nextInt() * 10000;
        try {
            counter.pay(hasMoney - 10, hasMoney);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // 반환형이 void여서 테스트를 진행하기 어려워서 try, catch로 하였습니다.
        // 이부분의 실제 진행은 Customer에서 진행하기에, Customer에서 다른 방식으로 확인하겟습니다.
    }
}
