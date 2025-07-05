package com.FAANG.Day7;

public class PatternThree {
    public static void main(String[] args) {
        three(5);
    }
    public static void three(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}
