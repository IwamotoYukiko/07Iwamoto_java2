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
            this.fiveHandred += count;
        } else if (price == 100) {
            this.handred += count;
        } else if (price == 50) {
            this.fifty += count;
        } else if (price == 10) {
            this.ten += count;
        } else if (price == 5) {
            this.five += count;
        } else if (price == 1) {
            this.one += count;
        }
    }


    public int GetCount(int price) {
        if (price == 500) {
            return this.fiveHandred;
        } else if (price == 100) {
            return this.handred;
        } else if (price == 50) {
            return this.fifty;
        } else if (price == 10) {
            return this.ten;
        } else if (price == 5) {
            return this.five;
        }
            return this.one;
        }



        public int GetAmount(){
            return fiveHandred * 500 + handred * 100 + fifty * 50
                    + ten * 10 + five * 5 + one;
        }

    }