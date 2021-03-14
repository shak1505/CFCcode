package com.company.assignment3;

public class Q3Swastik {
    public static void main(String[] args) {
        int row = 7,col=7;
        swastika(row, col);
    }

    public static void swastika(int row, int col) {
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(i<row/2){
                   if(j<col/2){
                       if(j==0)
                           System.out.print("*");
                       else
                           System.out.println(" " + " ");

                   }
                   else  if(j==col/2)
                       System.out.print(" *");
else {
    if(i==0)
        System.out.print(" *");
                   }
               }
           }
       }
    }

}
