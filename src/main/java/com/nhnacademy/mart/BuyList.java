package com.nhnacademy.mart;

import com.sun.jdi.request.DuplicateRequestException;
import java.text.FieldPosition;
import java.util.ArrayList;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    // TODO add 메서드 생성


    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }
}
