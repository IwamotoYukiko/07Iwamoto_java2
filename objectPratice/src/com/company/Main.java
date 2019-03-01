package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        com.company.CoinCase coincase = new CoinCase();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("硬貨􏰀種類を入力し􏰁てください。");
            int price = scanner.nextInt();
            System.out.println("硬化の枚数を入力してください。");
            int count = scanner.nextInt();

            coincase.AddCoins( price, count );

        }

        System.out.println("500円は" + coincase.GetCount(500) + "枚 " +
                           "100円は" + coincase.GetCount(100) + "枚 " +
                           "50円は" + coincase.GetCount(50) + "枚 " +
                           "10円は" + coincase.GetCount(10) + "枚 " +
                           "1円は" + coincase.GetCount(1));


        System.out.println("総額は" + coincase.GetAmount() + "円です。");


    }
}
