package com.company.assignment3;

import java.util.Scanner;

public class Q6SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n= scn.nextInt();
        int[] arr1= new int[n];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = scn.nextInt();
        }
        int m;
        m= scn.nextInt();
        int[] arr2= new int[m];
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] = scn.nextInt();
        }
      //  int res = sumArray(arr1, arr2);
       // System.out.println(res);
        sumArray1(arr1, arr2);
    }

    public static void sumArray1(int[] arr1, int[] arr2) {
   int[] sum = new int[arr1.length> arr2.length? arr1.length : arr2.length];
   int c=0;
   int i = arr1.length-1;
   int j = arr2.length-1;
   int k=  sum.length-1;
   while(k>=0){
       int d=c;
       if(i>=0){
           d=d+arr1[i];
       }
       if(j>=0){
           d=d+arr2[i];
       }
       c=d/10;
       d=d%10;
       sum[k]=d;
       k--;
       i--;
       j--;
   }
   if(c!=0){
       System.out.print(c);
   }
   for(int val: sum){
       System.out.print(val);
   }
    }

    public static int sumArray(int[] arr1, int[] arr2) {
      int p=0,q=0;
        for (int i = 0; i < arr1.length; i++) {
            p=p*10+arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            q=q*10+arr2[i];
        }
        return p+q;
    }
}
