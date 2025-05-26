package org.UIAutomation.May.May242025;

public class Vowels$Consonants {
    public static void main(String[] args) {

        String s = "malayalam";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else
                    consonants++;
            }
        }
        System.out.println("No: of vowels"+vowels);
        System.out.println("No: of consonants"+consonants);
    }
}
