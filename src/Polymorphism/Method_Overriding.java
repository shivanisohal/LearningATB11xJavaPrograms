package Polymorphism;


class Dog{
    void display()
    {
        System.out.println("Dog Bark");
    }
}
class Animal extends Dog
{
    @Override
    void display() {
        System.out.println(" Animals ");
    }
}
public class Method_Overriding {

    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.display();

        Dog obj2= new Animal();
        obj2.display();

        Dog obj3 = new Dog();
        obj3.display();
    }
}
