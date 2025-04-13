package Exception;

public class Multiple_Exception {
    public static void main(String[] args) {

        String userInput = args[0];//ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(userInput);
        int result=0;
        try {
            result =100/a;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(result);

    }
}
