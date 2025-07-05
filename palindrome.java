package com.FAANG.Day5;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check weather given number is palindrome or not");
        int num = input.nextInt();
        if(reverseNumber.reverseNum(num)==num){
            System.out.println("Given number is palindrome number ");
        }else {
            System.out.println("Given number is not palindrome number ");
        }
    }
}
