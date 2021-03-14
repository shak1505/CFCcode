package com.company.compCoding;

import java.util.Scanner;

public class subtractNtimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t;
        t= scn.nextInt();
        for (int i = 0; i <t ; i++)

        {
            int n,k;
            n= scn.nextInt();
            k= scn.nextInt();
            while(n>=k){
                n=n-k;
            }
            System.out.println(n);

        }
    }
}
