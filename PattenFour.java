package com.FAANG.Day7;

public class PattenFour {
    public static void main(String[] args) {
        four(5);
    }

    public static void four(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }
    }
}
