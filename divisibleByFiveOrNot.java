package com.FAANG.Day2;

import java.util.Scanner;

public class divisibleByFiveOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = input.nextInt();
        boolean isDivisible = divisibleOfFive(num);
        if (isDivisible){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean divisibleOfFive(int n){
        if(n%5==0) return true;
        return false;
    }
}
