package com.company.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q7ContiMaxSubGrp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,k;
        n= scn.nextInt();
        k =scn.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i] = scn.nextInt();

        }
        maxSubGroup(a,k);
    }

    public static void maxSubGroup(int[] a,int k) {
        Arrays.sort(a);
        for (int i = a.length-k; i <a.length ; i++) {
            System.out.print(a[i] + " ");

        }

    }
}
