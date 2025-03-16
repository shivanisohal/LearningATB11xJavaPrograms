package PracticePrograms;

import java.util.Scanner;

public class PalendromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string value=");
        String value= sc.nextLine();
        String reserve="";
        for(int i=value.length()-1;i>=0;i--)
        {
            reserve+=value.charAt(i);

        }
        if(value.equals(reserve))
        {
            System.out.println("palendrome"+value);
        }
        else
        {
            System.out.println("not a palendrome"+value);
        }


    }
}
