package Classes;


class Person_Details
{
    String Name;
    int Age;
    String Gender;
    String ID;
    Double Salary;
    long Phone_Number;

    void Persone_details()
    {
        System.out.println("Details : "+Name+"\n"+Age+"\n"+Gender+"\n"+ID+"\n"+Salary+"\n"+Phone_Number);
    }

}

public class Classes_and_Functions {
    public static void main(String[] args) {

       Person_Details obj=new Person_Details();
        obj.Name="Abhi";
        obj.Age=27;
        obj.Phone_Number=676767688;
        obj.Gender="Female";
        obj.ID="002333ABC";
        obj.Salary=12000.23;
        obj.Persone_details();



    }
}
