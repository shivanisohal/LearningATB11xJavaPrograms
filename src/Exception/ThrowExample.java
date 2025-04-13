package Exception;

public class ThrowExample {
    public static void main(String[] args) {

        int age =18;
        if (15<age)
        {
            throw new ArithmeticException ("you must be 18+ ");
        }
    }
}
