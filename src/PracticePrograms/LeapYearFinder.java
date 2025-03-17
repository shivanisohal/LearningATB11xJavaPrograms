package PracticePrograms;

import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Year=");
        int Year=scan.nextInt();
        Boolean IsLeap=false;

        if((Year%4==0 && Year%100!=0)||(Year%400==0))
        {
            IsLeap=true;
        }
        if(IsLeap)
        {

            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
