package com.company;

public class MainClass {
    public static void main(String[]args){
        String name1="Shantanu";
        String name2="Pawar";
        //  1.Concatenate to strings
        String Name3=name1 +" "+name2;
        System.out.println(Name3);
        //  2.charAt
        System.out.print("The char at 0 index in name1 is ");
        System.out.println(name1.charAt(0));
        //  3.replace
        String result=name1.replace('a','p');
        System.out.println(result);
        //  4.substrings
        String newname="Shantanu Pawar";
        System.out.println(newname.substring(2,5));
        //  5.length
        System.out.println(newname.length());
    }
}
