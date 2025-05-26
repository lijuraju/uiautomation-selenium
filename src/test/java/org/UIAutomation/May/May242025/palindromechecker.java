package org.UIAutomation.May.May242025;

public class palindromechecker {
    public static void main(String[] args) {

        String str = "Malayalam1";
        str = str.toLowerCase();
        String reversedStr = "";

        for(int i = str.length()-1; i>=0; i--)
        {
            char ch = str.charAt(i);
            reversedStr = reversedStr + ch;
        }

        if (reversedStr.equals(str))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.printf("Not a palindrome");
    }
}
