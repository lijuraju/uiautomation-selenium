package org.UIAutomation.May.May242025;

public class StringReverse {

    public static void main(String[] args) {

        String str = "I am a automation tester";
        String reversedStr = "";

        //use a  for loop to reverse the string
        //Convert the string to a character array

        for(int i = str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            reversedStr = reversedStr + ch;
        }

        System.out.printf(reversedStr);
    }
}
