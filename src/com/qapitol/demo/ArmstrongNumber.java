package com.qapitol.demo;

public class ArmstrongNumber {
    public static void main(String[] args){
        int num=1000;
        int rem;
        int sum=0;
      for(int i=1;i<=num;i++){
         int n=i;
          while(n>0){
              rem=n%10;
              sum=sum+(rem*rem*rem);
              n=n/10;
          }
          if(sum==i){
              System.out.println("armstrong number is"+ i);
          }
          sum=0;
      }

    }
}
