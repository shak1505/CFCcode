package com.company.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q8IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        for (int i = 0; i <n ; i++) {
            arr1.add(i, scn.nextInt());

        }
        int m = scn.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<Integer>(m);
        for (int i = 0; i <m; i++) {
            arr2.add(i, scn.nextInt());

        }
        intersectionArray(arr1, arr2);

    }

    public static void intersectionArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
    ArrayList<Integer> arr3 = new ArrayList<Integer>();
        Collections.sort(arr1);
        Collections.sort(arr2);

        for (int i = 0; i < arr1.size(); i++) {
            for (int j = i; j <arr2.size(); j++) {
                if(arr1.get(i) == arr2.get(j)){
                    arr3.add(arr1.get(i));
                    break;
                }
            }

        }

        System.out.println(arr3);
    }
}
