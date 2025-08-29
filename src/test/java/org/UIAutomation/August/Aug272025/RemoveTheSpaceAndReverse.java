package org.UIAutomation.August.Aug272025;

public class RemoveTheSpaceAndReverse {

    public static void main(String[] args) {

        String s = "Good morning";

        s = s.replace(" ","");

        String rev = "";

        for(int i = s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);
    }
}
