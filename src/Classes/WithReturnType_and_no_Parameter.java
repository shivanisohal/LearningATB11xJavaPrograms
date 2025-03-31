package Classes;

public class WithReturnType_and_no_Parameter {
    //This function returns a value but does not take parameters.

    int getnumber()
    {
        return 10;
    }

    public static void main(String[] args) {
        WithReturnType_and_no_Parameter obj = new WithReturnType_and_no_Parameter();
        int number= obj.getnumber();
        System.out.println(number);
    }
}
