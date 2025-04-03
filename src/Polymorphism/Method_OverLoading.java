package Polymorphism;

class A
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    int add(int a,int b, int c, int d)
    {
        return a+b+c+d;
    }
}
public class Method_OverLoading {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.add(2,2));
        System.out.println(obj.add(2,2,2));
        System.out.println(obj.add(2,2,2,2));
    }
}
