package org.UIAutomation.May.May022025;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "abcd";
        String reversedStr = "";

        for(int i = str.length()-1;i>=0;i--){

            char ch = str.charAt(i);
            reversedStr = reversedStr + ch;
        }
        System.out.println("Reversed String: " + reversedStr);
    }
}
