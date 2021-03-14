package com.company.assignment2;

import java.util.Scanner;

public class Q5 {
    public static void inverseInt(int [] num,int n) {
        int[] num1= new int[n];
        for (int i = 0; i <num.length ; i++) {
            num1[num[i]-1]=i+1;
        }
        for (int i = 0; i <num1.length ; i++) {
            System.out.print(num1[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n=scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length ; i++) {
            num[i]=scn.nextInt();
        }
        inverseInt(num,n);
    }


}
