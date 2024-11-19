package com.qapitol.demo;

import java.util.Scanner;

public class Calculator {

public void menu(int input1,int input2){
    System.out.println("enter option");
    Scanner sc=new Scanner(System.in);
    int selectOpt = sc.nextInt();
    switch (selectOpt){
        case 1:
            System.out.println(input1+input2);
            break;
        case 2:
            System.out.println(input1-input2);
            break;

        case 3:
            System.out.println(input1*input2);
            break;
        case 4:
            System.out.println(input1/input2);
            break;
        default:
            System.out.println("select correct option");
    }
}

public static void main(String[] args){
   Calculator cl=new Calculator();
   cl.menu(34,22);
}

}


