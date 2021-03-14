package com.company.assignment2;

import java.util.Scanner;

public class Q1 {


    private static int reverseInt(int p) {
        int rem,s=0;
        while(p>0)
        {
            rem=p%10;
            s=s*10+rem;
            p=p/10;
        }
         return s;
    }

    private static int decOcta(int n) {
        int rem,t=0,q;
        while(n>0)
        {
            rem=n%8;
            t=t*10+rem;
            n=n/8;
        }
        q=reverseInt(t);
        return q;
    }
    public static int decOcta1(int n) {
        int res=0,place=1,rem;
        while (n>0)
        {
            rem=n%8;
            n=n/8;
            res=res+place*rem;
            place=place*10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int res,n,f;
        System.out.println("enter the decimal number");
        n=scn.nextInt();
        res=decOcta(n);
        System.out.println(res);
        f=decOcta1(n);
        System.out.println(f);
    }


}
