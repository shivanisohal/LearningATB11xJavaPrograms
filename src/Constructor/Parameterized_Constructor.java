package Constructor;

class Person
{
String Name;
long Salary;
    Person(String name,long salary)
    {
       Name=name;
       Salary=salary;
    }
    void display()
    {
        System.out.println(Name+","+Salary);
    }
}
public class Parameterized_Constructor {
    public static void main(String[] args) {
Person obj= new Person("Ankur", 100000);
obj.display();

    }
}
