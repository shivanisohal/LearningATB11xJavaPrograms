package Wrapper_Class;

import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {

        //Some are static methods (which you call using Integer.), and others are instance methods (which you call on an Integer object).

        System.out.println("------------------Static Methods");
        //Static methods of Integer Wrapper Class

        //1.Convert String to Premitive Int
        int num= Integer.parseInt("240");
        System.out.println(num);

        //2.Convert String to Integer object
        Integer num2=Integer.valueOf(230);
        System.out.println(num2);

        //3.Compare 2 int values
        int results = Integer.compare(4,5);
        System.out.println(results);

        //4.Max and Min
        System.out.println(Integer.max(12,33));
        System.out.println(Integer.min(3,1));

        System.out.println("------------------Non Static methods");

        Integer obj=Integer.valueOf(num);
        boolean isequal=obj.equals(240);

        System.out.println("240 equal to :"+isequal);


    }
}
