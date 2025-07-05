package com.FAANG.Day6;

public class FindMaximumElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7};
        int maximum = findMaximum(arr);
        System.out.println(maximum);
    }

    public static int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
