package com.company.assignment3;

import java.util.Scanner;

public class Q12DiffASCII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "acb";
        diffASCII(str);
    }

    public static void diffASCII(String str) {
    StringBuilder q = new StringBuilder();
       q.append(str.charAt(0));
        for (int i = 1; i <str.length() ; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int p = curr-prev;
            q.append(p);
            q.append(curr);
        }
        System.out.println(q);
    }
}
