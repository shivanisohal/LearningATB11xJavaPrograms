package Inheritance;


class GParent
{
    public void display()
    {
        System.out.println("Class GParents");
    }
}
class Parent extends GParent
{
    public void display2()
    {
        System.out.println("Class Parents");
    }
}
class Child extends Parent
{
    public void display3()
    {
        System.out.println("Class Child");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
        obj.display2();
        obj.display3();
    }

}
