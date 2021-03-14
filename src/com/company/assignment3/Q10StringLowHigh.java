package com.company.assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10StringLowHigh {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        changeOddEven(str);

    }

    public static void changeOddEven(String str) {
        StringBuilder q = new StringBuilder(str);
        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            int p = (int) ch;
            if (p % 2 == 0) {
                char uch = (char) --p;
                q.setCharAt(i, uch);
            } else {
                char uch = (char) ++p;
                q.setCharAt(i, uch);
            }
        }
        System.out.println(q);
    }
}
