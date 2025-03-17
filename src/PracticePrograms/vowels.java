package PracticePrograms;

import java.util.Locale;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any line=");
        String Str=sc.nextLine();
        Str=Str.toLowerCase();
        int Vowel=0;
        for(int i=0;i<Str.length();i++)
        {
            char ch=Str.charAt(i);
           if(ch =='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' )
           {
               Vowel++;
               System.out.print(ch);
           }

        }

        System.out.println(Vowel);
    }
}
