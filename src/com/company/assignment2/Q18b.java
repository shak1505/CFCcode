package com.company.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n, extraCandies;
        n= scn.nextInt();
        int[] candies=new int[n];

        for (int i = 0; i < candies.length; i++) {
            candies[i]= scn.nextInt();
        }
        extraCandies=scn.nextInt();
        Q18b sm = new Q18b();
        sm.kidsWithCandies(candies, extraCandies);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        int max=Integer.MIN_VALUE;
        List<Boolean> rez = new ArrayList<>();
        for (int i = 0; i <candies.length ; i++) {

            if(max<candies[i]){
                max=candies[i];
            }
        }
        for (int i = 0; i <candies.length ; i++) {
            if(extraCandies + candies[i]>=max) {
                rez.add(true);
            }
            else{
                rez.add(false);
            }

        }
        return rez;

    }
}
