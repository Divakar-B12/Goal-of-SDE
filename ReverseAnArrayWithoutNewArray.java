package com.FAANG.Day6;

public class ReverseAnArrayWithoutNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);

    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
