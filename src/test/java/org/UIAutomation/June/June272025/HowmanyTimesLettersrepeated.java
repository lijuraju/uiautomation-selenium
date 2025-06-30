package org.UIAutomation.June.June272025;

// This program counts how many times each letter appears in a string
public class HowmanyTimesLettersrepeated {

    public static void main(String[] args) {

        // Input string to analyze
        String str ="malayalam";

        // Create array to store count of each character (using ASCII values as index)
        // Size 256 covers all ASCII characters
        int[] count = new int[256];

        // First loop: Count frequency of each character
        for(int i=0;i<str.length();i++)
        {
            // Get character at current position
            char ch = str.charAt(i);
            // Increment count for that character's ASCII value
// This line increments the count for the current character in the count array
// The ASCII value of the character 'ch' is used as the index into the array
// For example, if ch='a' (ASCII 97), then count[97] is incremented by 1
// This tracks how many times each character appears in the input string
count[ch]++;

        }

        // Second loop: Print characters that appear more than once
        for(int i=0;i<256;i++)
        {
            // Only print if character appears multiple times
            if(count[i] >1 )
            System.out.println((char) i + "  " + count[i]);
        }

    }
}