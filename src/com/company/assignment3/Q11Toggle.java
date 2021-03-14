package com.company.assignment3;

import java.util.Scanner;

public class Q11Toggle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       String str= scn.next();
       Toggle(str);
    }

    public static void Toggle(String str) {
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          if(ch>='A' && ch<='Z'){
              char uch = (char)(ch + 'a' - 'A');
              s.setCharAt(i, uch);
          }
          else if(ch>='a' && ch<='z'){
              char uch = (char)(ch + 'A' -'a');
              s.setCharAt(i, uch);
          }

        }
        System.out.println(s);
    }
}
