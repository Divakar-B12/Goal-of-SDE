package com.FAANG.Day2;

import java.util.Scanner;

public class positiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        if (n>0){
            System.out.println("Positive number ");
        } else if (n<0) {
            System.out.println("Negative number ");
        }else{
            System.out.println("Number is equal to zero ");
        }
    }
}
