package Exception;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number=");
        int a=sc.nextInt();

        int b=100;
        try
        {
            int result = b / a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally section");
            sc.close();
        }

    }
}
