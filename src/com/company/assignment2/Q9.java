package com.company.assignment2;

import java.util.Scanner;

public class Q9 {
    public static int countPrime(int[] a, int n) {
      int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j * j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,res;
        n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
       res= countPrime(a, n);
        System.out.println(res);
    }




}
