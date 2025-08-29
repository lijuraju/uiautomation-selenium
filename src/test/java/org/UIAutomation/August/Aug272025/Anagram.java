package org.UIAutomation.August.Aug272025;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String a = "Listen";
        String b = "Silent";

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] a1 = a.toLowerCase().toCharArray();
            char[] b1 = b.toLowerCase().toCharArray();

            Arrays.sort(a1);
            Arrays.sort(b1);

            boolean p = Arrays.equals(a1, b1);

            if (p)
                System.out.println("Anagram");
            else
                System.out.println("Not an anagram");

        }

    }
}
