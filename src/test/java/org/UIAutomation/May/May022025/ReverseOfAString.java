package org.UIAutomation.May.May022025;

public class ReverseOfAString {

    public static void main(String[] args) {


        String str = "This is a TCS interview";
        String reversedWord= "";

        String[] words = str.split("\\s+");

        for (int i = words.length-1; i >= 0; i--) {
            char ch = words.toString().charAt(i);
            reversedWord = reversedWord + ch;
        }

        System.out.println("Original String"+str);
        System.out.println("Reversed string"+reversedWord);

    }
}
