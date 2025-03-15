package ex_01_java_basic;

public class Lab0011_In_Dec_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b = 20;
        System.out.println(--b + b++ + b--);
        System.out.println(b);
    }
}

