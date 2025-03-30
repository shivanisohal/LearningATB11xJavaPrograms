package ArrayPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value=");
        int n = sc.nextInt();

        for (int k = 1; k <= n; k++) {
            for (int l = 1; l <= n-k; l++) {

                System.out.print(" ");
            }
                for (int j = 1; j <=k ; j++) {
                        System.out.print("*");
                    }

                System.out.println("");

            }


            {

            }
        }
    }

