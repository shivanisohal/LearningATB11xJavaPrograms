package Constructor;



//2. Calling Current Class Method
class AB{

    AB()
    {
        System.out.println("Constructor");
        this.display();
    }
    void display()
    {
        System.out.println("Display method");

    }
}

public class This2 {
    public static void main(String[] args) {
AB obj=new AB();

    }
}
