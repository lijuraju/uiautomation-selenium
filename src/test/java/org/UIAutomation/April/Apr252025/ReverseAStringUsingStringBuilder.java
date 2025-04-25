package org.UIAutomation.April.Apr252025;

public class ReverseAStringUsingStringBuilder {
    public static void main(String[] args) {
        String str = "Hello World123";
        StringBuilder builder = new StringBuilder(str);

        builder.reverse();

        System.out.println("Original String is " + str);
        System.out.println("Reversed String is " + builder);
    }
}
