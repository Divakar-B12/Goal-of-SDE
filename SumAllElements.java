package com.FAANG.Day6;

import java.util.Scanner;

public class SumAllElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int totalSum = sumOfElements(arr);
        System.out.println(totalSum);
    }

    public static int sumOfElements(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
