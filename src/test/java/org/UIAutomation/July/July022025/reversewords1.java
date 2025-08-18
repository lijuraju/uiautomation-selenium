package org.UIAutomation.July.July022025;

public class reversewords1 {

    public static void main(String[] args) {



        String s = "I Love Java Programming";

        String[] sarray = s.split(" ");
        String rev = "";
        for(String a : sarray)
        {
            for(int i=a.length(); i>=0; i--)
            {
                rev = rev + a.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println(rev);
    }
}
