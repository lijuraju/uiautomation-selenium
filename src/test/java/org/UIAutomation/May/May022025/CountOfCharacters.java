package org.UIAutomation.May.May022025;

public class CountOfCharacters {

    public static void main(String[] args) {
        String str = "TCS@123";
        int letterCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for(int i =0;i<str.length(); i++)
        {

            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                letterCount++;
            }
            else if(Character.isDigit(ch))
            {
                digitCount++;
            }
            else
            {
                specialCharCount++;
            }
        }
        System.out.println("LetterCount"+letterCount);
        System.out.println("DigitCount"+digitCount);
        System.out.println("SpecialCharCount"+specialCharCount);
    }
}
