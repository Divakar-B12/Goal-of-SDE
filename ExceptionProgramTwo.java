package com.FAANG.Day9;

import java.util.Scanner;

public class ExceptionProgramTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number ");
        int num2 = input.nextInt();
        try{
            int result = num1/num2;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Mugithappa");
        }
    }
}
