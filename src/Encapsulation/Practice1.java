package Encapsulation;

class Test1
{
   private String username;
   private String password;

   Test1(String username, String password)
   {
       this.username=username;
       this.password=password;
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean admin) {
        if(admin)
        {
            this.password = password;
        }else
        {
            System.out.println("Not a Admin");
        }
    }
}


public class Practice1 {
    public static void main(String[] args) {
Test1 obj=new Test1("Shivani","Passwordtest");
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setUsername("Sohal");
        System.out.println(obj.getUsername());
        obj.setPassword("Password123",true);
        System.out.println(obj.getPassword());

    }
}
