package com.company.assignment6;

import java.util.Scanner;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        boolean p = isValid(s);
        System.out.println(p);

    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == '}'){
                if(st.size()>0 && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == ']'){
                if(st.size()>0 && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        return true;

    }
}
