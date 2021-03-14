package com.company.assignment2;

import java.util.Scanner;

public class Q6 {
    public static int gcd(int a, int b) {
        while(a!=b) {
            if(a>b){
                a=a-b;
            }
            else if(b>a){
                b=b-a;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,res;
        a=scn.nextInt();
        b=scn.nextInt();
        res=gcd(a,b);
        System.out.println(res);
    }


}
