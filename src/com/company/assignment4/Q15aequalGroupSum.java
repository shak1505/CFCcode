package com.company.assignment4;

public class Q15aequalGroupSum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5};
        int k = equalSubGroupSum(a);
        if(k==-1){
            System.out.println("NOT POSSIBLE");
        }
        else{
            for(int i=0;i<=k;i++){
                System.out.print(a[i] + ", ");
            }
            System.out.println();
            for(int j=k+1;j<a.length;j++){
                System.out.print(a[j] + ", ");
            }
        }
    }

    private static int equalSubGroupSum(int[] a) {
        int leftSum=0;
        for (int i = 0; i < a.length; i++) {

            leftSum+=a[i];
            int rightSum=0;
            for (int j = i+1; j < a.length; j++) {
         rightSum+=a[j];

            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }

}
