package com.qapitol.demo;

public class SumOfDigits {
    public int sumOfno(int number){

        int sum=0;
        int rem;
        int temp=number;
        while(temp>0){
           rem=temp%10;

           sum=sum+rem;
           temp=temp/10;

        }
      return sum;
    }


    public static void main(String[] args){
        SumOfDigits sd=new SumOfDigits();
        int number=1235;
        System.out.println(sd.sumOfno(number));
    }
}
