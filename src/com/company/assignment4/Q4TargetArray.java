package com.company.assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4TargetArray {
    public static void main(String[] args) {
        int[] a={0,4,2,2,1,2,3,4,2};
        int target =2;
        ArrayList<Integer> targetArray = new ArrayList<>();
      ArrayList<Integer> arr = fun(a,0,target,targetArray);
        System.out.println(arr);
    }

    private static ArrayList<Integer> fun(int[] a, int index, int target, ArrayList<Integer> targetArray) {
  if(index>a.length-1){

return targetArray;
  }
   if(a[index]==target){
       targetArray.add(index);
   }

   return  fun(a, index+1, target, targetArray);
    }


}
