package PracticePrograms;


import java.util.Scanner;

public class PrintEnteredIntegerValue {
    public static void main(String[] args) {
        int Num;
        System.out.println("Enter any Number=");
        //Scanner obj
        Scanner n=new Scanner(System.in);
        // Read the next integer from the screen
        Num=n.nextInt();
        System.out.println("Entered number="+Num);
        n.close();
    }
}
