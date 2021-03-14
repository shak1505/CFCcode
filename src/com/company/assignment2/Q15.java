package com.company.assignment2;

import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        int[] a={3,1,2,9,7,5,-1,6};
        Arrays.sort(a);

        for (int i = 0; i <a.length ; i++){
int x;
x=9-a[i];
            int start=i+1,end=a.length-1;
while(start<end){
    if(a[start]+a[end]==x){
        System.out.println("(" + a[i] + ", " + a[start] + ", " +a[end] + ")");
start++;
    end--;
    }
    else if(a[start]+a[end]>x){
        end--;
    }
    else if(a[start] + a[end]<x){
        start++;
    }
            }
        }
    }
}
