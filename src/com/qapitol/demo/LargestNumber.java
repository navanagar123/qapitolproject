package com.qapitol.demo;

import java.util.Scanner;

public class LargestNumber {

    public void findingLargestNumber(int num1,int num2,int num3){

      if(num1>num2 && num1>num3){
          System.out.println("Largest number is"+" " +num1);
      }
      else if(num2>num3){
          System.out.println("Largest number is"+ num2);
      }
      else{
          System.out.println("largest number is"+num3);
      }

    }


    public static void main(String[] args){

        System.out.println("enter first number");

        Scanner sc=new Scanner(System.in);
        int firstNum=sc.nextInt();

        System.out.println("enter second number");
        int secondNum=sc.nextInt();

        System.out.println("enter third number");
        int secthirdNum=sc.nextInt();

        LargestNumber lnum=new LargestNumber();
        lnum.findingLargestNumber(firstNum,secondNum,secthirdNum);


    }
}
