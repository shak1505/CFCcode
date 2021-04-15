package com.company.assignment6;

import java.util.Scanner;
import java.util.Stack;

public class minAddtomakevalidString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int k = minAddtoMake(s);
        System.out.println(k);
    }

    private static int minAddtoMake(String S) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch == ')'){
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }
                else{

                    st.push(ch);

                }
            }
            else{

                st.push(ch);
            }

        }
        return st.size();

    }

}
