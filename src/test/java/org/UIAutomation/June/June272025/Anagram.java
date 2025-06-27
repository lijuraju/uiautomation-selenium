package org.UIAutomation.June.June272025;

import java.util.Arrays;

public class Anagram {
    public static boolean Anagram(String s1, String s2) {


        //Check length
        //Convert to lowercase
        //convert to character array
        //sort the array
        //compare the values
        if (s1.length() != s2.length()) {
            System.out.println("Not an anagram");
            return  false;
        } else {
            char[] a = s1.toLowerCase().toCharArray();
            char[] b = s1.toLowerCase().toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a, b);

        }


    }

    public static void main(String[] args) {

        System.out.println(Anagram("silent","listen1"));
    }

}
