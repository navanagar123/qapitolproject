package com.qapitol.demo;

public class BreakAndContinue {
public static void main(String[] args){


    int numTOBreak=10;
    int numberToSkip=2;
    for(int i=1;i<=20;i++){
        if(i==numberToSkip){
            continue;
        }
        if(i==numTOBreak){
            break;
        }
        System.out.println(i);
    }


}
}
