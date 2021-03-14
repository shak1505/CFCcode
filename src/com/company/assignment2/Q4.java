package com.company.assignment2;

import java.util.Scanner;

public class Q4 {


    public static int reverseInt(int p) {
        int rem,s=0;
        while(p>0)
        {
            rem=p%10;
            s=s*10+rem;
            p=p/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,res;
        n= scn.nextInt();
        res=reverseInt(n);
        System.out.println(res);
    }
}
