package com.company.assignment3;

import java.util.Scanner;

public class Q2RowWave {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int i;
        for (i = 0; i < 4; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(arr[i][j] + " , ");
            }

            ++i;
            for(int k = 3;k>=0;k--){

                System.out.print(arr[i][k] + " , ");
            }



        }

    }
}
