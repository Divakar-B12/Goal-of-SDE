package com.FAANG.Day7;

public class PatternOne {
    public static void main(String[] args) {
        one(5);
    }
    public static void one(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
