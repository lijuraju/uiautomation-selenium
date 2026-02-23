package org.UIAutomation.February.Feb232025;

public class ReverseAString {

    public static void main(String[] args) {

        String a = "Hello";
        char[] c = a.toCharArray();

        String reversed = "";


        for(int i= a.length()-1; i>=0; i--)
        {
            reversed = reversed + c[i];
        }

        System.out.println(reversed);
    }
}
