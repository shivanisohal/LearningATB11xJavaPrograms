package Constructor;

class A {
    String name;

    //1. Referring to Instance Variables
    A(String Name) {
        this.name = Name;

    }
    void Display()
    {
        System.out.println(this.name);
    }

}
public class ThisKeyword {
    public static void main(String[] args) {

        A obj=new A("Shivani");
        obj.Display();
    }
}
