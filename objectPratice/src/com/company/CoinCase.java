package com.company;

public class CoinCase {
    public int fiveHandred;
    public int handred;
    public int fifty;
    public int ten;
    public int five;
    public int one;


    public void AddCoins(int price, int count) {
        if (price == 500) {
            fiveHandred += count;
        } else if (price == 100) {
            handred += count;
        } else if (price == 50) {
            fifty += count;
        } else if (price == 10) {
            ten += count;
        } else if (price == 5) {
            five += count;
        } else if (price == 1) {
            one += count;
        }
    }


    public int GetCount(int price){
        if (price == 500) {
            return fiveHandred;
        } else if (price == 100) {
            return handred;
        } else if (price == 50) {
            return fifty;
        } else if (price == 10) {
            return ten;
        } else if (price == 5) {
            return five;
        } else if (price == 1) {
            return one;
        }
            return 0;  //正常に終了
    }


    public int GetAmount(){
        return (fiveHandred * 500) + (handred * 100) + (fifty * 50)
                + (ten * 10) + (five * 5) + one;
    }

}