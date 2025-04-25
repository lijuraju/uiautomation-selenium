package org.UIAutomation.April.Apr252025;

public class PalindromeOfANumber {

    public static void main(String[] args) {

        int number = 1215;
        int reversedNumber = 0;

        // Store the original number to compare later

        int originalNumber = number;


        //Reverse the number
        while(number != 0){

            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number /10;

        }

        if (reversedNumber == originalNumber) {

            System.out.println(originalNumber + " is a palindrome.");
        }

        else
            System.out.println(originalNumber + " is not a palindrome.");
    }
}
