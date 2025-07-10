package com.FAANG.Day9;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws AgeException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your age");
        int age = input.nextInt();
        if (age<18){
            throw new AgeException();
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}
