package com.company.assignment2;

import java.util.Scanner;

public class Q2 {
    public static int fun(int n1, int n2, char ch) {
        if(ch == '*') {
            return n1*n2;
        }
        else if(ch == '/') {
            return n1/n2;
        }
        else if(ch == '%') {
            return n1%n2;
        }
        else if(ch == '+') {
            return n1+n2;
        }
        else if(ch == '-') {
            return n1-n2;
        }
return 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1, n2,res;
        char ch;
        n1=scn.nextInt();
        n2=scn.nextInt();
        ch=scn.next().charAt(0);
        res=fun(n1,n2,ch);
        System.out.println(res);
    }


}
