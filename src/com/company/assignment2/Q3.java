package com.company.assignment2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch;
        ch=scn.next().charAt(0);
        if(ch >=97 && ch<=122)
        {
            System.out.println("Lowercase");
        }
        else if(ch>=65 && ch<=90)
        {
            System.out.println("Uppercase");
        }
    }
}
