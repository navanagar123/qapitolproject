package com.qapitol.demo;

public class EvenNumber {
    public static void main(String[] args){

        for(int i=0;i<30;i++){

            if(i%2!=0){
                if(i>20) {
                    continue;
                }
                    System.out.println(i);

            }

        }

    }
}
