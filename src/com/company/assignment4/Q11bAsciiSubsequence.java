package com.company.assignment4;

public class Q11bAsciiSubsequence {
    public static void main(String[] args) {

            String s = "ab";
            int k = asciiSub("ab", " ");
            System.out.println(k);

    }

    private static int asciiSub(String unproc, String proc) {

        if (unproc.isEmpty()) {

            return 1;
        }
        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        int p = (char) ch;
       return asciiSub(unproc, proc) + asciiSub(unproc, proc + ch)+ asciiSub(unproc, proc + p);


    }
}