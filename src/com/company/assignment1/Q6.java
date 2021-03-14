package com.company.assignment1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,r,p=0;
        n= scn.nextInt();
        while(n>0) {
            r=n%10;
            p=p*10+r;
            n=n/10;
        }
        System.out.println(p);
    }
}
