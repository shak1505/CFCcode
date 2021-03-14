package com.company.assignment3;

import java.util.Scanner;

public class Q5ClockSpiral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = 4, col = 4;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= scn.nextInt();
            }

        }

        int minr=0;
        int minc=0;
        int maxr= row-1;
        int maxc = col-1;
        int count=0;
        int totalCount = row*col;
        while(count<totalCount){
            for (int i = minr,j=minc; j <=maxc ; j++) {
                System.out.print(arr[i][j] + " , ");
               count++;
            }
            minr++;
            for (int i = minr,j=maxc; i <=maxr ; i++) {
                System.out.print(arr[i][j] + " , ");
                count++;

            }
            maxc--;
            for(int i=maxr,j=maxc;j>=minc;j--){
                System.out.print(arr[i][j] + " , ");
                count++;
            }
            maxr--;
            for (int i = maxr,j=minc; i >=minr ; i--) {
                System.out.print(arr[i][j] + " , ");
                count++;

            }
            minc++;
        }
    }
}
