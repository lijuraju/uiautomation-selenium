package org.UIAutomation.May.May022025;

public class Swap2Strings {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        str1 = str1 + str2; // str1 becomes "HelloWorld"
        System.out.println("str1: " + str1); // Output: str1: HelloWorld
        str2 = str1.substring(0, str1.length() - str2.length());
        System.out.println(str2);// str2 becomes "Hello"
        str1 = str1.substring(str2.length()); // str1 becomes "World"

        System.out.println("str1: " + str1); // Output: str1: World
        System.out.println("str2: " + str2); // Output: str2: Hello
    }
}
