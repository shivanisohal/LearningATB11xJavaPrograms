package ex_02_Strings;

public class Lab0022_StringCreation {
    public static void main(String[] args) {

        //Two ways of String creation in java
        //First way -- Using string Literals, it goes into the String Constant Pool (SCP)
        String str="Shivani";

        //Second way -- using new keyword, this forces Java to create a new object in Heap Memory
        String str2=new String("Sohal");
    }
}
