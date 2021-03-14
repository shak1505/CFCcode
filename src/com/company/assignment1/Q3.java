package com.company.assignment1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1,n2,d=0;
        System.out.println("Enter first number");
        n1=scn.nextInt();
        System.out.println("Enter second number");
        n2=scn.nextInt();
                while(n1!=n2)
                {
                    if(n1>n2)
                    {
                        d=n1-n2;
                        n1=d;
                    }
                    else if(n2>n1)
                    {
                        d=n2-n1;
                        n2=d;
                    }
                }
        System.out.println(d);
    }
}
