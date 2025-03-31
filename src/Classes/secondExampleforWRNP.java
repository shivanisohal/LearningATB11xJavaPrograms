package Classes;

import java.util.Random;

public class secondExampleforWRNP {

    int random()
    {
        Random number= new Random();
       return number.nextInt(100);
    }

    public static void main(String[] args) {
        secondExampleforWRNP obj=new secondExampleforWRNP();
        int num= obj.random();
        System.out.println(num);
    }
}
