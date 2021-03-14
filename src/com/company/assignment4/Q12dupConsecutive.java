package com.company.assignment4;



public class Q12dupConsecutive {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
       StringBuilder str = new StringBuilder();
       str = dup(s,0,1);
        System.out.println(str);

    }

    private static StringBuilder dup(StringBuilder s,int i,int j) {

      if(j>s.length()-1 && i>s.length()-2){
          return s;
      }


        if(s.charAt(i)==s.charAt(j)){
            s.insert(j,'-');
        }

     return dup(s,i+1,j+1);
    }
}
