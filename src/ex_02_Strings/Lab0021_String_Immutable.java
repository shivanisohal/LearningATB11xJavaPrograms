package ex_02_Strings;

public class Lab0021_String_Immutable {
    public static void main(String[] args) {
        String name = "shivani";
        name.toUpperCase();//Cannot modify the original value
        System.out.println(name);

        //another example
        String str="sohal";
        str.concat("shubham");//Cannot modify the original value
        System.out.println(str);

        //CorrectWay for above
        String str2="Test";
        str=str.toUpperCase();
        System.out.println(str);
    }
}
