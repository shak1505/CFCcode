package com.company.assignment2;

import java.util.Scanner;

public class Q8 {
    public static int countMultiple(int[] a, int n) {
        int count=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%5==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,res;
        n=scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]= scn.nextInt();
        }
       res= countMultiple(a, n);
        System.out.println(res);
    }


}
