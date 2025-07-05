package com.FAANG.Day5;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        boolean isPrimeNumber = isPrimeOrNot(n);
        if (isPrimeNumber){
            System.out.println("Given number is Prime number");
        }else {
            System.out.println("Given number is not prime number ");
        }
    }
    public static boolean isPrimeOrNot(int num){
        boolean flag = true;
        if (num <=1 ){
            return false;
        }else {
            for (int i = 2; i <=Math.sqrt(num) ; i++) {
                if(num%i==0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            return true;
        }else {
            return false;
        }
    }
}
