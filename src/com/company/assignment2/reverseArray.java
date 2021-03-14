package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n=scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <num.length ; i++) {
            num[i]=scn.nextInt();
        }
        revArray(num,n);
        System.out.println(Arrays.toString(num));
    }

    public static void revArray(int[] num, int n) {
        int i=0,j=num.length-1;
        while(i<j){
            swap(num,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int[]num,int i, int j) {
        int t = num[i];
        num[i]=num[j];
        num[j]=t;

    }
}
