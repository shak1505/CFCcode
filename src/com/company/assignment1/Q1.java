package com.company.assignment1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int credit;
        System.out.println("Enter the credits");
        credit = scn.nextInt();
        if(credit<4500 && credit>0 )
        {
            System.out.println("Rising star");
        }
        else if(credit>=4500 && credit<6000)
        {
            System.out.println("Mega Leader");
        }
        else if(credit>=6000 && credit<7500)
        {
            System.out.println("Gega leader");
        }
        else if(credit>=7500)
        {
            System.out.println("Tera leader");
        }
    }
}
