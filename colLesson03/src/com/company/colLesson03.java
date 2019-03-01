package com.company;
import java.util.Scanner;

public class colLesson03 {
    public static void main(String[] args) {

        String[] word = new String[5];
        String[] meaning = new String[5];


        int i = 0;
        Scanner scanner = new Scanner(System.in);
        try{
        while( true ) {
            if (i == 0) {
                System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
            } else {
                System.out.println("次の単語とその意味をスペースで区切って入力して下さい。”e”で終了します");
            }
            String scan1 = scanner.next();
            if( "e".equals(scan1)){
                break;
            }
            String scan2 = scanner.next();
            word[i] = scan1;
            meaning[i] = scan2;
            i++;
        }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("登録制限を超えました。登録データは以下になります。");
        }


            Word[] words = new Word[5];
            for (int x = 0; x < 5; x++) {
                words[x] = new Word(word[x], meaning[x]);
            }



        for(int y=0; y< word.length; y++ ){
            if(word[y] == null) {
                break;
            } else {
                words[y].println(y);
            }
        }

        System.out.println(i + "件、登録しました");


    }
}
