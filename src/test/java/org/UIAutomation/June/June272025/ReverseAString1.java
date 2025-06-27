package org.UIAutomation.June.June272025;

public class ReverseAString1 {

    public static void main(String[] args) {

        String s  = "hexaware";

        String rev = "";

        for(int i = s.length()-1; i>=0;i--){

            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
