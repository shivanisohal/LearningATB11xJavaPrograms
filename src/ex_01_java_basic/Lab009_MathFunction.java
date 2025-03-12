package ex_01_java_basic;

public class Lab009_MathFunction {
    public static void main(String[] args) {
        int X = 10, Y = 10, Z = 10 ;
        int P=2;
        double Result= Math.cbrt(Math.pow(X,P)+Math.pow(Y,P)-Math.abs(Z));
        System.out.println("Result="+Result);

    }
}
