package Exception;

public class HandleException {
    public static void main(String[] args) {

        int a=0;
      int result=0;
        try {
            result = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(result);

    }
}
