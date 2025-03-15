package ex_01_java_basic;

import java.util.Scanner;

public class Lab0014_EvenOdd_Ternaryoperator {
    //print using configuration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value=");
        int number=scanner.nextInt();

        if(number% 2==0)
        {

            System.out.println("This is Even number");
        }
        else
        {
            System.out.println("This is Odd Number");
        }
        scanner.close();

    }
}
