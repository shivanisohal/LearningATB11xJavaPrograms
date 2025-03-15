package ex_01_java_basic;

import java.util.Scanner;

public class Lab0013_Max_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter First Number=");
        int FirstNumber=scanner.nextInt();

        System.out.println(" Enter Second Number=");
        int SecondNumber=scanner.nextInt();

        System.out.println(
                (
                        FirstNumber>SecondNumber
                                ?"FirstNumber is greater":
                                (
                                        SecondNumber>FirstNumber
                                        ?"SecondNumber is greater"
                                                :"Both are equal"
                                )
                )
        );

    }
}
