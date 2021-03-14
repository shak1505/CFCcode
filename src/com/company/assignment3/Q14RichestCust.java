package com.company.assignment3;

import java.util.Scanner;

public class Q14RichestCust {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m,n;
        m= scn.nextInt();
        n= scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int k = richestCustomerWealth(arr);
        System.out.println(k);
    }

    public static int richestCustomerWealth(int[][] arr) {
       int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            int sum =0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum = sum +arr[i][j];
                if(sum>max){
                    max = sum;
                }

            }
        }
        return max;
    }
}
