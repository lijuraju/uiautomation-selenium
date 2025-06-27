package org.UIAutomation.June.June272025;

public class RemoveTheSpaceAndReverse {

    public static void main(String[] args) {

        String s = "Liju Raju";
        String s1 = s.replaceAll(" ","");

        String rev = "";

        for(int i = s1.length()-1;i>=0; i--){
             rev = rev + s1.charAt(i);
        }
        System.out.println(rev);
    }
}
