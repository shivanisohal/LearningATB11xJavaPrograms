package PracticePrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String=");
        String value=sc.nextLine();
        String Reverse= new StringBuffer(value).reverse().toString();

        if(value.equals(Reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
