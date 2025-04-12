package Wrapper_Class;




public class Manual_Boxing_Unboxing {
    public static void main(String[] args) {

        String num="20";
        // Manual Boxing
        Integer numObj = Integer.valueOf(10); // int to Integer
        Integer num2 = Integer.parseInt(num);//String to wrapper

        Double doubleObj = Double.valueOf(5.5); // double to Double

        // Manual Unboxing
        int number = numObj.intValue();           // Integer to int
        double dbl = doubleObj.doubleValue();  // Double to double


        System.out.println(num2);

        System.out.println("Integer object: " + numObj);
        System.out.println("Unboxed int: " + number);

        System.out.println("Double object: " + doubleObj);
        System.out.println("Unboxed double: " + dbl);
    }
}
