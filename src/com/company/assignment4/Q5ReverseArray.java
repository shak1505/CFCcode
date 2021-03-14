package com.company.assignment4;

import java.util.Arrays;

public class Q5ReverseArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int i=0;
        int j=a.length-1;
        int[] arr=fun(a,i,j);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] fun(int[] a, int i, int j) {
  if(i>=j){
      return a;
  }
   if(i<j){
       swap(a,i,j);
   }
   return fun(a,i+1,j-1);
    }

    private static void swap(int[] a, int i, int j) {
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }


}
