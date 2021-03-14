package com.company.assignment4;

import java.util.Scanner;

public class Q2SumOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n= scn.nextInt();
        int k = sum(n);
        System.out.println(k);
    }

    private static int sum(int n) {
       if(n==0){
           return 0;
       }
        int sum1 = 0;
        sum1 = n + sum(n-1);
        return sum1;
    }
}
