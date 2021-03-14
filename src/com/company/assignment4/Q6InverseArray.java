package com.company.assignment4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q6InverseArray {
    public static void main(String[] args) {
        int[] a = {3,4,0,1,2};
        int[] num = new int[a.length];
        int[] arr= fun(a,0,num);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] fun(int[] a, int index,int[] num) {

    if(index>a.length-1){
        return num;
    }

    num[a[index]] = index;
    return fun(a,index+1,num);

    }
}
