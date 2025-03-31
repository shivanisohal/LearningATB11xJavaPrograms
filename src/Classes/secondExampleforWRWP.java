package Classes;

public class secondExampleforWRWP {
    double interest(int p, int r, int t)
    {
        return p*r*t/100;
    }

    public static void main(String[] args) {
        secondExampleforWRWP obj=new secondExampleforWRWP();
        double Interest= obj.interest(20,30,40);
        System.out.println(Interest);
    }
}
