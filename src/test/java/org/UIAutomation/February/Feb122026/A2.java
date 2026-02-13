package org.UIAutomation.February.Feb122026;

public class A2 {

    // A man, a plan , a canal : Panama

    public static void main(String[] args) {

        String s = "A man, a plan , a canal : Panama";

        //putting into a character array
        char array[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        //traversing the array
        for(char c : array)
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }

        String modifiedInput = sb.toString();
        String reversedInput = sb.reverse().toString();

        if(modifiedInput.equals(reversedInput))

            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

}
