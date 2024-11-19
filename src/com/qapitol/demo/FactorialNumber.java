package com.qapitol.demo;

public class FactorialNumber {
    public static void main(String[] args){

       int factorialNUm=5;
       int fact=1;
       for(int i=1;i<=factorialNUm;i++){
           fact=fact*i;
       }
       System.out.println(fact);

    }
}
