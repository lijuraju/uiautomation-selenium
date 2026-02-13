package org.UIAutomation.February.Feb122026;

public class A3 {

    public static void main(String[] args)
    {
        String input = "How are you";

        char array[] = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for( char c  : array)
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(c);
            }
        }

        String cleanedInput = sb.toString();
        String reversedInput = sb.reverse().toString();

        if (cleanedInput.equalsIgnoreCase(reversedInput))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
