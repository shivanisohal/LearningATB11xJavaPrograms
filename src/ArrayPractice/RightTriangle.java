package ArrayPractice;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any numeric value=");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
