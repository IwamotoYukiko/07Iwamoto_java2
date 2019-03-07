package com.company;


public class Word {

    public String word;
    public String meaning;

    public Word(String input_word, String input_meaning){
        word = input_word;
        meaning = input_meaning;
    }


    public void println(){
        System.out.println("単語：" + word + "　意味：" + meaning);
    }

}
