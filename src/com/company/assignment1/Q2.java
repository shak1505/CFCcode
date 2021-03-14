package com.company.assignment1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double interest =0,amount,rate,time;
        System.out.println("enter amount");
        amount=scn.nextDouble();
        System.out.println("enter rate");
        rate= scn.nextDouble();;
        System.out.println("enter time");
        time = scn.nextDouble();
        interest = (amount*rate*time)/100;
        System.out.println(interest);
    }
}
