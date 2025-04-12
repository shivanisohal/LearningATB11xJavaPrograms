package PracticePrograms;

import java.util.Scanner;

public class CheckifaNumberisDivisibleby5and11 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Number=");
        int number=scan.nextInt();

        if(number%5==0 && number%11==0)
        {
            System.out.println(" Yes!! this number is Divisible by 5 and 11");
        }
        else
        {
            System.out.println(" Not divisible by 5 and 11 ");
        }
    }
}
