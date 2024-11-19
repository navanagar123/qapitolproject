package com.qapitol.demo;

public class Voting {
    public void votingAge(int age){
     if(age>=18 && age<=100){
         System.out.println("eligible for voting");
     }
     else if(age<18){
         System.out.println("not eligible");
        }
     else{
         System.out.println("Incorrect age");
        }
    }
    public static void main(String[] args){
        Voting vt=new Voting();
        vt.votingAge(59);

    }
}
