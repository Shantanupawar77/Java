//package com.Addition_two_NUMBERS;
import java.util.Scanner;

public class Addition_two_NUMBERS {

     public static void main(String[] args) {
         System.out.println("Taking input from user :");
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the first number :");
         int num1=sc.nextInt();
         System.out.println("Enter the second number :");
         int num2=sc.nextInt();
         int sum=num1+num2;
         System.out.print("The sum of these two numbers:");
         System.out.println(sum);
    }
}