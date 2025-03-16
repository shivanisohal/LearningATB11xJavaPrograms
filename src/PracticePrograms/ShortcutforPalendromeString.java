package PracticePrograms;

import java.util.Scanner;

public class ShortcutforPalendromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string=");
        String value=sc.nextLine();
        String reserved= new StringBuilder(value).reverse().toString();
        if(value.equals(reserved))
        {
            System.out.println("Palendrome");

        }
        else
        {
            System.out.println("not");
        }
    }
}
