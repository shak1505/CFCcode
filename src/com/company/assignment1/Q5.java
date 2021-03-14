package com.company.assignment1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,count=0;
        n=scn.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);

    }
}
