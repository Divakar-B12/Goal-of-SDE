package com.FAANG.Day7;

public class PatternSix {
    public static void main(String[] args) {
        six(5);
    }
    public static void six(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}
