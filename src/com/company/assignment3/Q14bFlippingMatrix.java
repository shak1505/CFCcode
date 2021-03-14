package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q14bFlippingMatrix {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int m,n;
        m= scn.nextInt();
        n= scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
          arr[i][j] = scn.nextInt();
            }

        }
        int[][] arr1 = flippingMatrix(arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[][] flippingMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
             int m=0,n=arr[i].length-1;
             while(m<n){
                 swap(arr,m,n,i);
                 m++;
                 n--;
             }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }

            }

        }
        return arr;
    }

    public static void swap(int[][] arr, int m, int n,int i) {
        int temp = arr[i][m];
        arr[i][m]=arr[i][n];
        arr[i][n]=temp;
    }
}
