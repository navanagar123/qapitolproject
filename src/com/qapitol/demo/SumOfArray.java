package com.qapitol.demo;

public class SumOfArray {
    public static void main(String[] args){

        int sumArray[]={1,2,3,4};
        int sum=0;
        for(int i:sumArray){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
