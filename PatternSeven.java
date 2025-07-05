package com.FAANG.Day7;

public class PatternSeven {
    public static void main(String[] args) {
        seven(5);
    }

    public static void seven(int n){
        int num = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num +" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
