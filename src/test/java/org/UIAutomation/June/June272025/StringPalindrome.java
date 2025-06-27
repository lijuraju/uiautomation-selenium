package org.UIAutomation.June.June272025;

public class StringPalindrome {
    public static void main(String[] args) {

        String s = "liju";
        String rev = "";
        s.toLowerCase();

        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if( rev.equals(s))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not palindrome");
    }
}
