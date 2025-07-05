package com.FAANG.Day6;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        countOddEven(arr);
    }

    public static void countOddEven(int[] nums){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("The total Even number is " +even +" The total odd number is "+odd);
    }
}
