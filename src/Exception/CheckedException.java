package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader(new File("J:\\TST\\Android.TXT"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());

    }

    }
}
