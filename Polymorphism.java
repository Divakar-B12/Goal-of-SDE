package com.FAANG.Day8;

public class Polymorphism {
    public static void main(String[] args) {
        two t = new two();
        t.nameOne();
        t.callSuper();
    }
}

class one{
    void nameOne(){
        System.out.println("Jonas Kahnwald");
    }
}

class two extends one{
    void name(){
        System.out.println("Martha Nielsen");
    }

    void callSuper(){
        super.nameOne();
    }
}
