package PracticePrograms;

public class FizzBuzzTestpractice {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 100; i++)
        {
            if (i % 3 == 0 && i%5==0)
            {
                System.out.println("Fizzbuzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fiz");
            }
            else if (i%5==0)
            {
                System.out.println("buzz");
            }
            else
            {
            System.out.println(i);
        }
    }
}}
