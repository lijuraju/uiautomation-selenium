package org.UIAutomation.July.July022025;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Welcome to Interview";

        String[] words = str.split(" ");
        String rev = "";

        for(String word: words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                rev = rev+ word.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println(rev);
    }
}
