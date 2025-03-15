package ex_01_java_basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0015_TriangleClassifier {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Side 1=");
        int side1 = scanner.nextInt();

        System.out.println(" Enter Side 2=");
        int side2=scanner.nextInt();

        System.out.println("Enter Side 3=");
        int side3 = scanner.nextInt();

        if((side1 + side2 > side3)
                &&
                (side2 + side3 > side1)
                &&
                (side3 + side1 > side2))
        {
            if(side1==side2 && side2==side3)
            {
                System.out.println("Equilateral");
            }
            else if (side1 == side2 || side2 == side3 || side3==side1)
            {
                System.out.println("isosceles");
            }
            else
            {
                System.out.println("scalene");

            }

        }
        else
        {
            System.out.println("No valid sides ");
        }

        }
    }

