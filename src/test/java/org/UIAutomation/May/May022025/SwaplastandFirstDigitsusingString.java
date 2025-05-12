package org.UIAutomation.May.May022025;

public class SwaplastandFirstDigitsusingString {

    public static void main(String[] args) {

        int number = 12345;
        //converted to a String
        String numStr = String.valueOf(number);

        //To get first Digit
        char firstDigit = numStr.charAt(0);
        //To get last Digit
        char lasDigit =  numStr.charAt(numStr.length()-1);

        StringBuilder swapped = new StringBuilder(numStr);

        swapped.setCharAt(0,lasDigit);
        swapped.setCharAt(swapped.length()-1,firstDigit);

        System.out.println("The new number after swapping last and first number is"+swapped);




    }
}
