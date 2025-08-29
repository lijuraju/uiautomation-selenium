package org.UIAutomation.June.June272025;

import java.util.HashSet;

public class DuplicateCharactersInStringUsingHashSet {

    public static void main(String[] args) {

    // This program will not correctly identify duplicate characters
    // The current implementation only stores unique characters in the HashSet
    // and prints the set, but doesn't track or print the duplicates
    String s = "malayalam";

        char[] a =  s.toCharArray();
        HashSet<Character> obj = new HashSet<>(); // Added type parameter
        HashSet<Character> duplicates = new HashSet<>(); // New set to store duplicates

        for(char c : a){
            // If add() returns false, character is already in set (duplicate)
            if(!obj.add(c)){
                duplicates.add(c);
            }
        }
        System.out.println("Duplicate characters: " + duplicates);


    }
}
