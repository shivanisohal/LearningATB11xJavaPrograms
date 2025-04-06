package Constructor;

class school
{
    String name;
    int Class;
    String Address;

    school(String name, int Class)
    {
       this.name=name;
       this.Class=Class;
    }
    school(String Address)
    {
        this.Address=Address;
    }
    void display()
    {
        System.out.println(this.name);
        System.out.println(this.Address);
        System.out.println(this.Class);
    }
}


public class Constructor_Overloading {
    public static void main(String[] args) {
        school obj=new school("AB School",6);
       obj.Address="Address test";
       obj.display();

    }
}
