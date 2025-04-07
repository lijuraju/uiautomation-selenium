package org.UIAutomation.April.Apr032025;

public class ReverseAString2 {

    static String s = "Good morning";

    public static void main(String[] args) {
       String reversed = "";

       for(int i=s.length()-1; i>=0;i--){
           reversed = reversed + s.charAt(i);
       }

         System.out.println("The reversed string is: " + reversed);

    }


}
