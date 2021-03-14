package com.company.assignment2;

import java.util.Scanner;

public class Q18d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,a,b,c;
        n= scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scn.nextInt();
        }
        a= scn.nextInt();
        b= scn.nextInt();
        c= scn.nextInt();
       int res= goodTriplets(arr,a,b,c);
        System.out.println(res);
    }

    private static int goodTriplets(int[] arr,int a,int b,int c) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k <arr.length-2 ; k++) {
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k]) <=b && Math.abs(arr[k]-arr[i])<=c){
                        count++;
                    }
                }

            }

        }
        return count;
    }
}
