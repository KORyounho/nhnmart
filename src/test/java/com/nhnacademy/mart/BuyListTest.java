package com.nhnacademy.mart;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BuyListTest {


    @Test
    @DisplayName("사고싶은 품목을 추가할때")
    void buyListAddTest() {
        BuyList buyList = new BuyList();
        buyList.add(new BuyList.Item("양파", 1_000));
        buyList.add(new BuyList.Item("양파", 1_000));
        buyList.add(new BuyList.Item("계란", 5_000));

        Assertions.assertEquals(buyList.getItems().size(), 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"양파", "계란"})
    @DisplayName("추가한 항목이 일치한지")
    void buyListAddItemNameValueTest() {
        BuyList buyList = new BuyList();
        buyList.add(new BuyList.Item("양파", 1_000));
        buyList.add(new BuyList.Item("계란", 5_000));

        Assertions.assertEquals("양파", buyList.getItems().get(0).getName());
        Assertions.assertEquals("계란", buyList.getItems().get(1).getName());
    }

}
