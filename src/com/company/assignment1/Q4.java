package com.company.assignment1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,i=1,t,p=2;
        n= scn.nextInt();
        while(i<=n){
            t=2*i-1;
            while(t!=0) {
                if (i == 1) {
                    System.out.println(p);
                    p=p+2;
                    t--;
                } else {
                    p = p + 2;
                    t--;
                }
            }
            i++;
            System.out.println(p);
        }

    }
}
