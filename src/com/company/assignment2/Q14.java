package com.company.assignment2;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] a={3,1,11,2,9,7,4,5,-1,13,6};
        int start=0,end=a.length-1;
        Arrays.sort(a);
        while(start<end){
            if(a[start]+a[end]==8){
                System.out.println("(" + a[start] + ", " + a[end] + ")");
            start++;
            end--;
            }
            else if(a[start] + a[end]>8){
                end--;
                }
            else if(a[start] + a[end]<8){
                start++;
                }
            }
        }
    }

