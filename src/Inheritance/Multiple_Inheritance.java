package Inheritance;

class a{
    public void check()
    {
        System.out.println("A Class");
    }
}
class b extends a{
    public void check()
    {
        System.out.println("B Class");
    }
}
class c extends a
{
 public void check()
 {
     System.out.println("C Class");
 }
}
//class d extends b,c//multiple inheritance
//{
//    public void check()
//    {
//        System.out.println("D Class");
//    }
//}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        c obj=new c();
        obj.check();
    }
}
