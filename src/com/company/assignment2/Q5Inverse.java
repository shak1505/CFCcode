package com.company.assignment2;

import java.util.Scanner;

public class Q5Inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int op=1,inv=0;
        while(n!=0)
        {
            int od=n%10; //original digit
              int id =op;
            int ip=od;   //inverted place
            //make change to inv using ip and id
           inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
    }
}

