package Exception;

public class MultipleCatch {
    public static void main(String[] args) {

        int a=10;
        int b= 0;
        try {
            b = a / 0;
        }
         catch (ArithmeticException e) {
            System.out.println("Not valid");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(b);

    }
}
