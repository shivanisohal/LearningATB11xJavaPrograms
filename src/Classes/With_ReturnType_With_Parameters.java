package Classes;

public class With_ReturnType_With_Parameters {

    int Addnumber(int A, int B)
    {
        return A+B;
    }

    public static void main(String[] args) {
        With_ReturnType_With_Parameters obj=new With_ReturnType_With_Parameters();
        int sum=obj.Addnumber(10,20);
        System.out.println("Sum of 2 numbers="+sum);
    }
}
