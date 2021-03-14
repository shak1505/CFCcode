package com.company.assignment4;

public class Q3TargetIndex {
    public static void main(String[] args) {
        int[] a = {3,2,1,8,6,1,3};
        int target = 1;
        int index = 0;
        int k = fun(a,target,index);
        System.out.println(k);
    }

    private static int fun(int[] a, int target, int index) {
        if(index==a.length-1){
            return -1;
        }
    int liisa = fun(a,target,index+1);

    if(liisa==-1){
        if(a[index]==target){
            return index;
        }
        else {
            return -1;
        }
    }
    else{
        return liisa;
    }
    }
}
