package Classes;

public class No_ReturnType_and_withParameter {

    //This function does not return a value (void), but takes parameters as input.

    void get(String name)
    {
        System.out.println("Your name is="+name);
    }

    public static void main(String[] args) {
       No_ReturnType_and_withParameter obj=new No_ReturnType_and_withParameter();
       obj.get("Shivani");
    }
}
