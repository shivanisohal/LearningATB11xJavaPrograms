package ex_01_java_basic;

import java.util.Scanner;

public class Lab0016_FibonacciSeries {
    public static void main(String[] args) {

        int n1=0;
        int n2=1;
        int fab;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number=");
        int n=sc.nextInt();
        System.out.print(n1+","+n2);
        for(int i=1;i<=n;i++)
        {
fab=n1+n2;
            System.out.print(","+fab);
            n1=n2;
            n2=fab;
        }
    }
}
