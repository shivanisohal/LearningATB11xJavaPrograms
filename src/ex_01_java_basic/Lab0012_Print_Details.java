package ex_01_java_basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0012_Print_Details
{
    public static void main(String[] args) {



Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Employee Name=");
        String name = scanner.nextLine();

        System.out.println("Enter Age=");
        int Age = scanner.nextInt();

        System.out.println("Enter Salary=");
        int salary=scanner.nextInt();

        System.out.println(" Employee details  : ");
        System.out.println("Name : "+name+"\n"+"Age : "+Age+"\n"+"Salary : "+salary);
        scanner.close();


    }
}
