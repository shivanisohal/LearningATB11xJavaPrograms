package Classes;

import java.time.LocalDateTime;

public class secondndExampleforNRNP {

void DateandTime()
{
     // No return, no parameters
   LocalDateTime now = LocalDateTime.now();
    System.out.println("Current Date and Time="+now);
}
public static void main(String[] args) {

    secondndExampleforNRNP obj=new secondndExampleforNRNP();
    obj.DateandTime();

    }
}
