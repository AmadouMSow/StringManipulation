package com.mycompany.icetask6.stringmanipulationandgithubpush;
import java.util.Scanner;

public class VowelCount {

    // Function to count the number of vowels in a string
    public static int countVowels(String sentence) {
        // Convert the string to lowercase to make the comparison case-insensitive
        sentence = sentence.toLowerCase();
        
        // Initialize a counter for vowels
        int vowelCount = 0;
        
        // Define the vowels
        String vowels = "aeiou";
        
        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            // Check if the current character is a vowel
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }       
        return vowelCount;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask lthe user to input a string
        System.out.println("Please enter a sentence:");
        String userInput = scanner.nextLine();
        
        // Call the countVowels function and print the result
        int numberOfVowels = countVowels(userInput);
        System.out.println("Number of vowels in the given sentence: " + numberOfVowels);
        
        // Close the scanner
        scanner.close();
    }
}
