package org.UIAutomation.April.Apr252025;

public class ReverseAString {
    public static void main(String[] args) {


        String str = "Hello World";
        String reversedStr = "";

        for(int i =str.length()-1; i>=0; i--)
        {
            reversedStr = reversedStr + str.charAt(i);
        }

        System.out.println("Original String is "+str);
        System.out.println("Reversed String is "+reversedStr);
    }
}
