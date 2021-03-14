package com.company.assignment4;

import java.util.Arrays;

public class Q8SelectionSortRec{
    public static void main(String[] args) {
        int[] a ={5,7,3,2,8};
        int n= a.length;
        fun(a,n);
        System.out.println(Arrays.toString(a));
    }

    private static void fun(int[] a, int n) {

        if (n == 1) {
            return;
        }

        int max = maxIndex(a, 0, n - 1);
if(max!=n-1) {
    swap(a, max, n - 1);
}
        fun(a, n - 1);
    }
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static int maxIndex(int[] nums, int ind1, int ind2) {

        int max = ind1;
        for(int i = ind1;i<=ind2;i++) {
            if(nums[i] > nums[max]) {
                max=i;
            }

        }
        return max;
    }
}

