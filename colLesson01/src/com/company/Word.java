package com.company;

public class Word {
    public String word;
    public String meaning;

    public Word(String word, String meaing){
        this.word = word;
        this.meaning = meaing;
    }

    public void println(){
        System.out.println("単語：" + word + "　意味：" + meaning);
    }

}
