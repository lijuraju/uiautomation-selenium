package org.UIAutomation.August.Aug272025;

public class DuplicateCahracterWithOutHashSet {

public static void main(String[] args) {
            System.out.println("Try programiz.pro");

            String s = "aabbcdd";
            char[] ch = s.toCharArray();
            // Create a string to store duplicates
            String duplicates = "";

            // Outer loop to iterate through each character
            for(int i=0;i<ch.length;i++) {
                // Inner loop to compare with remaining characters
                for(int j=i+1;j<ch.length;j++) {
                    // Check if character is duplicate and not already found
                    if(ch[i] == ch[j] && duplicates.indexOf(ch[i]) == -1) {
                        duplicates = duplicates + ch[i];
                    }
                }
            }
            // Print all duplicate characters
            System.out.println("Duplicate characters: " + duplicates);
        }
    }