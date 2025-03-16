package PracticePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRead {
    public static void main(String[] args) throws IOException {
        // Step 1: Create BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Step 2: Read input
        System.out.print("Enter your name: ");
        String name = reader.readLine();  // reads a full line

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());  // convert String to int

        System.out.print("Enter your percentage: ");
        double percent = Double.parseDouble(reader.readLine()); // convert String to double

        // Step 3: Display output
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percent);
    }
    }
