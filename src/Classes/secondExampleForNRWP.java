package Classes;

public class secondExampleForNRWP {

    void area(int length, int width)
    {
        int area=length*width;
        System.out.println("Area="+area);
    }
    public static void main(String[] args) {

        secondExampleForNRWP obj=new secondExampleForNRWP();
        obj.area(20,30);

    }
}
