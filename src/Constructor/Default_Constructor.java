package Constructor;

class Car
{
    String Car_name;

    Car()
    {
        Car_name="Toyota";

    }
    void display()
    {
        System.out.println("Car name="+Car_name);
    }
}



public class Default_Constructor {
    public static void main(String[] args) {
Car obj=new Car();
obj.display();
    }
}
