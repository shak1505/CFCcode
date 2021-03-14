package com.company.assignment4;
//0.Take as input str, a string. A “twin” is defined as two instances of a char
//separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so
//"AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which
//recursively counts the number of “twins” in a string. Print the value returned.
//Eg: AXAXA
//Output: 3
public class Q10twinRec {
    public static void main(String[] args) {
        String s ="AxAxA";
        int k = count(s,0);
        System.out.println(k);
    }

    private static int count(String s, int count) {
       if(s.length()==2){
           return count;
       }
        if(s.charAt(0)==s.charAt(2)){
            count++;
        }
        s=s.substring(1);
        return count(s,count);
    }
}
