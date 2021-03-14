package com.company.assignment4;

public class Q14checkparantheses {
    public static void main(String[] args) {
    StringBuilder str = new StringBuilder("[a+{b+(c+d)+e}+f]");
    StringBuilder s = fun(str,0);
        System.out.println(s); //want to print "[{()}]" but instead getting an empty string

    }

    private static StringBuilder fun(StringBuilder str,int i) {
       if(i>=str.length()){
           return str;
       }
        if(str.charAt(i)!='[' && str.charAt(i)!=']'&& str.charAt(i)!='{'&& str.charAt(i)!='}'&& str.charAt(i)!='('&& str.charAt(i)!=')'){
            str.delete(i,i+1);
            i--;
        }
        return fun(str,i+1);
    }
}
