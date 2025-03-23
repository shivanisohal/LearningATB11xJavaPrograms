package ex_01_java_basic;

import PracticePrograms.ReverseString;

import java.util.Scanner;

public class Lab0019_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string=");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
         char ch=str.charAt(i);
         reverse+=ch;
        }
        if(reverse.equals(str))
        {
            System.out.println("Palindrome");
        }
       else
       {
            System.out.println( "not a Palindrome");
        }
    }
}
