package ArrayPractice;

import java.util.Scanner;

public class Odd_Even_with_Array {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements =");
        n = sc.nextInt();//Taking Size
        int numbers[]= new int[n];//Declaring Array

        for(int i=0;i<numbers.length;i++)
        {
           numbers[i]=sc.nextInt();
        }


        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2==0)
            {
                System.out.println("Even Number"+numbers[i]);
            }
            else
            {
                System.out.println("Odd Number"+numbers[i]);
            }
        }



    }
}
