package com.company;
import java.util.Scanner;

public class colLesson01 {
    public static void main(String[] args) {

        Word[] words = new Word[10];

        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int i = 0;
        while(!input.equals("e")) {
            String[] scn = input.replaceAll("　", " ").split(" ",0); //空白で区切る
            Word wd = new Word(scn[0], scn[1]);
            words[i] = wd;
            i++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = scan.nextLine();
        }


        for(int x=0; x< i; x++ ){
            words[x].println();
        }


        System.out.println(i + "件、登録しました");


    }
}