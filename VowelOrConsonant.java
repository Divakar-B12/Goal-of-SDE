package com.FAANG.Day2;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char character = input.next().charAt(0);
        if (character=='a' || character=='e' || character=='i'|| character=='o'||character=='u'||character=='A' || character=='E' || character=='I'|| character=='O'||character=='U'){
            System.out.println("Given character is Vowel");
        }else{
            System.out.println("Given character is Consonant");
        }
    }
}
