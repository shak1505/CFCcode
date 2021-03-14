package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q9MinMaxKSub {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        kSubMinMaxSum(arr, k);
    }

    public static void kSubMinMaxSum(int[] arr,int k) {
        int[] arr1 = new int[k];
        int sum =0;
        for (int i = 0; i < arr.length-k+1; i++) {
            int m=i;
            for (int j = 0; j < arr1.length; j++) {

                arr1[j]=arr[m];
                m++;
            }
            Arrays.sort(arr1);
            sum= sum + arr1[0] + arr1[arr1.length-1];
        }
        System.out.println(sum);
    }
}
