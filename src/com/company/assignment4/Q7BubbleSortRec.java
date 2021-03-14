package com.company.assignment4;


import java.util.Arrays;

public class Q7BubbleSortRec {
    public static void main(String[] args) {
        int[] a={8,5,7,3,2};
        fun(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void fun(int[] a, int n) {
    if(n==1){
        return;
    }
        for (int i = 0; i < n-1; i++) {
            if (a[i] > a[i + 1]) {
                swap(a, i, i + 1);

            }
        }
        fun(a,n-1);
    }

    private static void swap(int[] a, int i, int j) {
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
