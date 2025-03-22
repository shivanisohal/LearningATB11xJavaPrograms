package PracticePrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string =");
        String str=sc.nextLine();
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(reverse);

    }
}
