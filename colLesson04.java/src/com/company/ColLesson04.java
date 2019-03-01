package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class ColLesson04 {
    public static void main(String[] args) {

        ArrayList<Word> word_array = new ArrayList<>();

        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (i<5) {
            if (i == 0) {
                System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
            } else {
                System.out.println("次の単語とその意味をスペースで区切って入力して下さい。”e”で終了します");
            }
            String scan1 = scanner.next();
            if ("e".equals(scan1)) {
                break;
            }
            String scan2 = scanner.next();
            word_array.add(new Word(scan1, scan2));
            i++;
        }



        for (int y = 0; y < word_array.size(); y++) {
            if (word_array.get(0) == null) {
                break;
            } else {
                word_array.get(y).println(y);
            }
        }


        System.out.println(i + "件、登録しました");

    }
}

