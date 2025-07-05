package com.FAANG.Day7;

public class PatternTwo {
    public static void main(String[] args) {
        two(5);
    }

    public static void two(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
