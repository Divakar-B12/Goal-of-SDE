package com.FAANG.Day2;

import java.util.Scanner;

public class multipleOfBothThreeAndFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println(num +" is multiple of both 3 and 5");
        }else{
            System.out.println(num +" is not multiple of both 3 and 5");
        }
    }
}
