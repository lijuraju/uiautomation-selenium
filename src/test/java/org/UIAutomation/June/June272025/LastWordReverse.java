package org.UIAutomation.June.June272025;

import java.util.Arrays;

public class LastWordReverse {

    public static void main(String[] args) {
        String s = "I Love Java Programming";
        String[] sarray = s.split(" ");
        String lastWord = sarray[sarray.length - 1];
        String rev = "";

        // Reverse the last word character by character
        for (int i = lastWord.length() - 1; i >= 0; i--) {
            rev = rev + lastWord.charAt(i);
        }

        System.out.println(rev);
    }
}