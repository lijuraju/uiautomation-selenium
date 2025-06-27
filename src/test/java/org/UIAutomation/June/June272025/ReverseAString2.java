package org.UIAutomation.June.June272025;

public class ReverseAString2 {

    public static void main(String[] args) {

        String s = "Liju";
        char[] c = s.toCharArray();
        String rev = "";

        for(int i = c.length-1; i>=0; i--){

            rev = rev + c[i];
        }
        System.out.println(rev);

    }
}
