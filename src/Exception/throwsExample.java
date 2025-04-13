package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class throwsExample {
    public static void getfile() throws FileNotFoundException
    {
        FileReader file= new FileReader(new File("J:\\TST\\Android.TXT"));

    }
    public static void main(String[] args)
    {
        try
        {
            getfile();
        }
        catch (FileNotFoundException f)
        {
            System.out.println(f.getMessage());
        }
    }



}
