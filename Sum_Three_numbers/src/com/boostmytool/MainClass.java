package com.boostmytool;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainClass {
    public static void main(String []args){
        System.out.println("Taking input from user");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        System.out.println("Enter the num3:");
        int num3=sc.nextInt();
        int sum =num1 +num2+num3;
        System.out.println();
        System.out.println(sum);

    }
}
