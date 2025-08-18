package org.UIAutomation.July.July022025;

public class OccuCharac {
    public static void main(String[] args) {

        String s = "Priynaka";

       int[] count = new int[256];

       for(int i =0; i<s.length();i++)
       {
           char ch = s.charAt(i);
           count[ch]++;
       }


       for(int i=0; i<256;i++)
       {
           if(count[i]>=1){

               System.out.println((char)i + " " + count[i]);

           }
       }




    }
}
