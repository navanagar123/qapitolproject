package com.qapitol.demo;

import java.util.Scanner;

public class AreaOfReactangle {

    public void calculateArea(int length,int width){
      double result=length*width;
    System.out.println(result);
    }





    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the rectangle");
        int length = sc.nextInt();

        System.out.println("enter the width of the rectangle");
        int width = sc.nextInt();
        AreaOfReactangle At=new AreaOfReactangle() ;
        At.calculateArea(length,width);




    }
}
