package com.company;

public class functions {
    public static void printJava(){
        System.out.println("Hello java");
    }
    public static void sumTwo(int a,int b){
        int sum=a+b;
        System.out.print("The sum is :");
        System.out.println(sum);

    }
    public static void differTwo(int a,int b){
        int differTwo=a+b;
        System.out.print("The difference between them  is :");
        System.out.println(differTwo);


    }
    public static void main(String[]args){
        printJava();
        sumTwo(3,5);
        printJava();
        differTwo(8,3);
        sumTwo(89,50);
        printJava();
        differTwo(190,45);
        differTwo(10,5);

    }
}
