package com.qapitol.demo;

import java.util.Scanner;

public class palindromeString {
    public void stringPalindrome(String text){
          int start=0;
          int end=text.length()-1;
          boolean flag=true;

          while(start<end){
              if(text.charAt(start)!=text.charAt(end)){
                  flag=false;
                  break;
              }
              start++;
              end--;
          }
        if(flag){
         System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }

    }

    public void integerPalindrome(int number){
         int temp=number;
         int reversenumber=0;
         int rem=0;
         while(temp>0){
             rem=temp%10;
             reversenumber=reversenumber*10+rem;
             temp=temp/10;

         }

if(reversenumber==number){
    System.out.println("it is a palindrome number");
}
else{
    System.out.println("it is not a palindrome");
}

    }


    public static void main(String[] args){
        palindromeString ps=new palindromeString();
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        ps.integerPalindrome(sc.nextInt());

        System.out.println("enter a String");
        ps.stringPalindrome(sc.next());

    }
}
