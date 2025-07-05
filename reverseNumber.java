package com.FAANG.Day5;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = input.nextInt();
        int reverseOfNumber = reverseNum(num);
        System.out.println(reverseOfNumber);

    }
    public static int reverseNum(int n){
        int ld;
        int reverse = 0;
        while(n>0){
            ld = n%10;
            reverse=reverse*10+ld;
            n=n/10;
        }
        return reverse;
    }
}
