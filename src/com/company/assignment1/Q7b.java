package com.company.assignment1;

import java.util.Scanner;

public class Q7b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int col,row=1,n;
        n=scn.nextInt();
        while(row<=n) {
            col=1;
            while(col<=row){
                System.out.print(col);
                col++;
            }
            row++;
            System.out.println();
        }


    }
}
