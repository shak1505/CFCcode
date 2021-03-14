package com.company.assignment4;
//Take as input str, a string. We are concerned with all the possible
//ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”,
//“98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
//a. Write a recursive function which returns the count of ascii-subsequences
//for a given string. Print the value returned.
//b. Write a recursive function which prints all possible ascii-subsequences for
//a given string (void is the return type for function).
//Eg: ab
//Output: b 98 a ab a98 97 97b 9798
// 9
public class Q11asciiSubsequence {
    public static void main(String[] args) {
        String s = "ab";
asciiSub("ab"," ");

    }

    private static void asciiSub(String unproc, String proc) {
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        int p =(char)ch;
        asciiSub(unproc, proc);
        asciiSub(unproc,proc+ch);
        asciiSub(unproc,proc + p);
    }
    }

