package com.company.assignment6;

public class CustomStack {
        int[] data;
        int top;
        int n;
        public CustomStack(int maxSize) {
            n = maxSize;
            data = new int[n];
            top=-1;
        }

        public void push(int x) {
            if(top!=data.length-1){
                data[++top]=x;
            }
        }

        public int pop() {
            if(top==-1){
                return -1;
            }
            else{
                int temp = data[top];
                top--;
                return temp;
            }
        }

        public void increment(int k, int val) {
            int min = Math.min(k,data.length);
            for(int i=0;i<min;i++){
                data[i]=data[i]+val;
            }
        }

}
