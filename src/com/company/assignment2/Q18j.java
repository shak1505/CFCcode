package com.company.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q18j {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n= scn.nextInt();;
        int[] prices = new int[n];
        for (int i = 0; i <prices.length ; i++) {
            prices[i]= scn.nextInt();

        }

        finalPrices(prices);
        System.out.println(Arrays.toString(prices));
    }

    public static void finalPrices(int[] prices) {

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j <prices.length; j++) {
                if(prices[j]<=prices[i]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }

            }
        }

    }
}
