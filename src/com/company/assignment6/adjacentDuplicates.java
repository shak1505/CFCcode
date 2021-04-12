package com.company.assignment6;

import java.util.Scanner;
import java.util.Stack;

public class adjacentDuplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String b = removeDuplicates(s);
        System.out.println(b);

    }
    public static String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        st.push(S.charAt(0));
        for(int i=1;i<S.length();i++){
            char ch = S.charAt(i);

            if(st.size()>0 && ch == st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }


        return sb.reverse().toString();
    }
}
