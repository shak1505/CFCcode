package com.company.assignment4;

public class Q13RemDuplicate {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("geeksforgeeks");
        StringBuilder r = dup(str,0,1);
        System.out.println(r);
    }

    private static StringBuilder dup(StringBuilder str, int i, int j) {
   if(j>=str.length()){
       return str;
   }
    if(str.charAt(i)==str.charAt(j)){
        str.delete(i,j);
        i--;
        j--;
    }

    return dup(str,i+1,j+1);
    }
}
