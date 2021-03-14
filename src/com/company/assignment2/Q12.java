package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {

     private static void sortOddEven(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j>0;j--) {
                if(nums[j]%2==0 && nums[j-1]%2==1) {
                    swap(nums,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {8,3,5,6,10,1,12};
        Arrays.sort(nums);
        sortOddEven(nums);
        System.out.println(Arrays.toString(nums));
    }
}
