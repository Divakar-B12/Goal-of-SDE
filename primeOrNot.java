package com.FAANG.Day3;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();
        boolean flag = true;
        if (n<=1){
            flag = false;
        }else {
            for (int i = 2; i <Math.sqrt(n) ; i++) {
                if(n%i==0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("Prime number");
        }else {
            System.out.println("Not a prime number");
        }
    }
}
