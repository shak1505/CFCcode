package com.company.assignment2;

import java.util.Scanner;

public class Q10 {


    public static boolean isSorted(int[] a, int n) {
    int c=0,b=0,i=0;

        while((c==0 || b==0) && i<n-1){
           if(a[i]<a[i+1]){
               c=1;
           }
           else if(a[i]>a[i+1]){
               b=1;
           }
           i++;
        }
        if((c==1 && b==0) || (c==0 && b==1)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n;
        boolean res;
        n=scn.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=scn.nextInt();

        }
       res= isSorted(a,n);
        System.out.println(res);
    }
}
