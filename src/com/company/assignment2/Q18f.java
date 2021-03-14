package com.company.assignment2;

import java.util.Scanner;

public class Q18f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length ; i++) {
            prices[i] = scn.nextInt();
        }
    //  int res = maxProfit(prices);
      //  System.out.println(res);
        int res2= maxProfit1(prices);
        System.out.println(res2);
    }

    public static int maxProfit1(int[] prices) {
        int minimal = Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i <prices.length ; i++) {
            if(minimal>prices[i]){
                minimal=prices[i];
            }
            else if(prices[i]-minimal>maxProfit){
                maxProfit=prices[i]-minimal;
            }
        }
        return maxProfit;
    }

    public static int maxProfit(int[] prices) {
        int diff;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                diff=prices[j]-prices[i];
                if(diff>max){
                    max=diff;
                }

            }
        }
        if(max>0){
            return max;
        }
        else {
            return 0;
        }
    }
}
