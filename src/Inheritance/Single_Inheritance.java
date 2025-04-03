package Inheritance;


class A
        {
            void display()
            {
                System.out.println("Class A method");
            }

                }

                class B extends A
                {
                   void display2()
                   {
                       System.out.println("Class B Method");
                   }
                }
public class Single_Inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
        obj.display2();
    }
}
