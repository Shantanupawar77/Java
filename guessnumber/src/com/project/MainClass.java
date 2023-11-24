package com.project;
import java.util.Scanner;
public class MainClass {
    public static void main(String[]args){
        int myNumber=(int)(Math.random()*100);
        Scanner sc= new Scanner(System.in);
        int number;
        do{
            System.out.println("Guess my number :");
            number=sc.nextInt();

            if(myNumber>number){
                System.out.println("Greater number plz!");
            }
            else if(myNumber<number){
                System.out.println("lesser number plz!");
            }
            else {
                System.out.println("You Guessed it right!");
            }

        }while (myNumber!=number);
    }
}
