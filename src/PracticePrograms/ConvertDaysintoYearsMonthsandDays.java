package PracticePrograms;

import javax.sound.midi.Soundbank;
import java.time.Year;
import java.util.Scanner;

public class ConvertDaysintoYearsMonthsandDays {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Entr any number =");
        int Number=scan.nextInt();
        int Years;
        int Months;
        int Days;
        int Extra;
        int Extra2;

        Years=Number/365;
        Extra=Number%365;
        Months=Extra/30;
        Extra=Extra%30;
        Days=Extra;

        System.out.println("Year:"+Years+" Months:"+Months+" Days:"+Days);


    }
}
