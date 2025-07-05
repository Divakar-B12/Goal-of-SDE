package com.FAANG.Day5;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = input.nextInt();
        int greaterNumber = bigNumber(num);
        System.out.println(greaterNumber);

    }

    public static int bigNumber(int n){
        int ld;
        int bigDigit = 0;
        while(n>0){
            ld = n%10;
            if(ld>bigDigit){
                bigDigit = ld;
            }
            n/=10;
        }
        return bigDigit;
    }
}
