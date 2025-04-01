package Constructor;


class Persons
{

    String name;
    int age;
    String address;
    long phone;
    boolean IsMale;

    Persons()
    {
        System.out.println("Default Values==========");
        this.name="unknown";
        this.address="No details";
        this.phone=00-00-00;
        this.IsMale=true;
        this.age=00;
        System.out.println("==========================");
    }
Persons(String Name,int Age, String Address,long Phone, Boolean isMale)
{
    this.name=Name;
    this.address=Address;
    this.phone=Phone;
    this.IsMale=isMale;
    this.age=Age;

}

void PrintDetails()
{
    System.out.println("Person details="+ name+"\n"+address+"\n"+phone+"\n"+IsMale+"\n"+age);

    System.out.println("===========================");
}

//functions

    void Eat()
    {
        System.out.println(name + " is Eating");
    }

    void Sleep()
    {
        System.out.println(name+" is sleeping");
    }

    void walk()
    {
        System.out.println(name+" is walking");
    }
}


public class DC_and_PC {
    public static void main(String[] args) {
Persons obj=new Persons();
obj.PrintDetails();

obj.name="vivek";
obj.age=27;
obj.address="abc address";
obj.phone=565465876;
obj.IsMale=false;
obj.PrintDetails();

obj.Eat();
obj.Sleep();
obj.walk();
    }
}
