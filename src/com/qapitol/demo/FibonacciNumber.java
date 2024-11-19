package com.qapitol.demo;

public class FibonacciNumber {
    public static void main(String[] args){

        int num1=0;
        int num2=1;

        System.out.println(num1);
        System.out.println(num2);
        int n=5;
        for(int i=2;i<n;i++){
            int num3=num1+num2;
            System.out.println(num3);

            num1=num2;
            num2=num3;


        }





    }
}
