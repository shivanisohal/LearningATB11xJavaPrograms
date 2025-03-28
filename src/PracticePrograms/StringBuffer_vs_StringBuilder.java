package PracticePrograms;

import java.sql.SQLOutput;

public class StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {

        //Using StringBuffer
        StringBuffer sb=new StringBuffer("shivani");
        System.out.println("Original="+sb);
        sb.reverse();
        System.out.println("Reversed="+sb);

        //Using StringBuilder
        StringBuilder SB=new StringBuilder("Builder");
        System.out.println("OrIginal="+SB);
        SB.reverse();
        System.out.println("Reversed="+SB);
    }
}
