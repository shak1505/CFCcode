package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q18e {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]= scn.nextInt();
        }
        sortedSquares(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sortedSquares(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            a[i] = a[i]*a[i];
        }
        Arrays.sort(a);
    }
}
