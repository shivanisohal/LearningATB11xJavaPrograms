package ex_01_java_basic;

import java.util.Scanner;

public class Lab0018_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string=");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count = 0;
        int count2=0;
        char ch;
        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                System.out.println("Vowel="+ch);
                count++;
            }
            else
            {
                System.out.println("Consonant="+ch);
                count2++;
            }
        }
        System.out.println("vowels total=" + count);
        System.out.println("Consonant total="+count2);
        sc.close();
    }
}
