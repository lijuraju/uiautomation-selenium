package org.UIAutomation.August.Aug272025;

public class ReverseAString {


    public static void main(String[] args) {

        String s = "Good morning";

        char[] a = s.toCharArray();//Convert it into a character array
        String rev = ""; //For storing the reverse variable

        for(int i = a.length-1; i>=0;i--){
              rev = rev + a[i];
        }

        System.out.println(rev);


    }


}
