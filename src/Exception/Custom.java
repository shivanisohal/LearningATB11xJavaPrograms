package Exception;

import java.sql.SQLOutput;

public class Custom {
    public static void main(String[] args) {

        PracticeExampleCustomException sbi = new PracticeExampleCustomException("INR",230);
        PracticeExampleCustomException HDFC=new PracticeExampleCustomException("INR",222);
        int Total=sbi.add(HDFC);
        System.out.println(Total);
    }
}
