package org.UIAutomation.April.Apr032025;

public class ReverseAString {
    public static void main(String[] args) {

        String s = "Hello World";

        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversed);
    }
}
