package PracticePrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any numbers=");
        int num=scanner.nextInt();
        int original=num;
        int reserved=0;
        while(num!=0)
        {
            int digit=num%10; //get the last digit
            //121%10=1 > 12%10=2 > 1%10=1
            reserved=reserved*10+digit;
            //0*10+1=1 > 1*10+2=12 > 12*10+1=121
            num=num/10; //remove last digit
            //121/10=12 > 12/10=1 > 1/10=0

        }
        if(reserved==original)
        {
            System.out.println("this is Palendrome number");

        }
        else
        {
            System.out.println(" Not a Palendrome number");
        }

    }
}
