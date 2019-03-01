package com.company;

public class ObjectPractice05 {

    public static void main(String[] args) {
        com.company.Person person1 = new com.company.Person("森田", "奈良");
        com.company.Person person2 = new com.company.Person("木村", "埼玉");
        com.company.Person person3 = new com.company.Person("高山", "東京");
        com.company.Person person4 = new Person("茂木", "沖縄");


        person1.getSelfIntroduction();
        person2.getSelfIntroduction();
        person3.getSelfIntroduction();
        person4.getSelfIntroduction();

    }

}
