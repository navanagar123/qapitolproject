package com.qapitol.demo;

public class demo {


public void StringOperation(String text){

    String[] arrString=text.split(" ");
    String rev=" ";
    for(String words:arrString){
        for(int i=words.length()-1;i>=0;i--){

           rev=rev+words.charAt(i);
        }

    }
    System.out.println(rev);

}


    public static void main(String[] args){

        demo d=new demo();
        d.StringOperation("I am Automation");

        int num1=15;   // 1 2 3 n1=3 n2=n1-n2 n3=n1-n2
        int num2=13;
        int num3=num1+num2;
        num1=num3;
        num2=num1-num2;


    }
}
