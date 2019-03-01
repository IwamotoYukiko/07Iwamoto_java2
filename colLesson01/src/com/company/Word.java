package com.company;

public class Word {
    public String word;
    public String meaning;

    public Word(String input_word, String input_meaing){
        word = input_word;
        meaning = input_meaing;
    }


    public void println(int y){
        System.out.println( y+1 + ". 単語：" + word + "　意味：" + meaning);
    }


}
