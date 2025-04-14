public class GenericMethodExample {
    public static void main(String[] args) {

        GenericMethodExample obj=new GenericMethodExample();
        obj.display("testing");
        obj.display(1222);
        obj.display("tstinggg22");

    }
public <T>  void display(T value)
    {
        System.out.println(value);
    }


}
