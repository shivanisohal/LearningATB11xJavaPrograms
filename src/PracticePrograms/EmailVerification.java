package PracticePrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email ID:");
        String email=sc.nextLine();
        String emailRegex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        //Compile Regex
        Pattern pattern=Pattern.compile(emailRegex);
        //Match the input email with pattern
        Matcher match=pattern.matcher(email);
        if((match.matches()))
        {
            System.out.println("Valid email");
        }
        else
            System.out.println("Not valid");

    }
}
//Meaning
//^	Start of string
//[a-zA-Z0-9._%+-]+	One or more valid characters before @ (username part)
//@	The at symbol
//[a-zA-Z0-9.-]+	One or more domain name characters (like gmail, yahoo)
//\.	A literal dot .
//[a-zA-Z]{2,}	Domain extension (like .com, .in, .org) with at least 2 letters
//$	End of string


//Concept----	Analogy
//emailRegex-----	A filter rule written on paper
//Pattern.compile()----	Preparing a machine using that rule
//Pattern pattern-----	Your filtering machine
//pattern.matcher(email)-----	Putting the email into the machine to test
//Matcher matcher-----	A box that holds test results
//matcher.matches()-----	Pressing a button to see if email passed or failed