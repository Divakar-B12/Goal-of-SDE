package com.FAANG.Day5;

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(multiply(2,5));
        System.out.println(multiply(2.5,5.1));
        System.out.println(multiply(2,5,5));
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double multiply(double a, double b, double c){
        return a*b*c;
    }
}
