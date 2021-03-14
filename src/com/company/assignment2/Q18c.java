package com.company.assignment2;

import java.util.Scanner;

public class Q18c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int[] nums={1,2,3,1,1,3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

        }
return count;
    }
}

