package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {

        NhnMart mart = new NhnMart();
        mart.prepareMart();
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.\n");

        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer younho = new Customer(buyList);

        // 장바구니를 챙긴다.
        younho.bring(mart.provideBasket());

        // 식품을 담는다.
        younho.pickFoods(mart.getFoodStand());

        System.out.println();
        // 카운터에서 계산한다.
        younho.payTox(mart.getCounter());

        //  mart.getFoodStand().updateFoodStand(buyList);
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력용을 받아 buyList 만들기

        BuyList buyList = new BuyList();

        Scanner scanner = new Scanner(System.in);
        System.out.print(">");

        String name = scanner.next();
        int itemAmout = Integer.parseInt(scanner.next());
        buyList.add(new BuyList.Item(name, itemAmout));
//        String name1 = scanner.next();
//        int itemAmout1 = Integer.parseInt(scanner.next());
//        buyList.add(new BuyList.Item(name1, itemAmout1));
//        String name2 = scanner.next();
//        int itemAmout2 = Integer.parseInt(scanner.next());
//        buyList.add(new BuyList.Item(name2, itemAmout2));

        scanner.close();
        return buyList;
    }
}
