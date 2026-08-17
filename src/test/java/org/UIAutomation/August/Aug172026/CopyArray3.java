package org.UIAutomation.August.Aug172026;

import java.util.Arrays;

public class CopyArray3 {

    public static void main(String[] args) {


        int[] ar1 = {10,20,30,40,50};//Declare the array

        int[] ar2 = new int[ar1.length]; //Declare the second array

        System.arraycopy(ar1,0,ar2,0,5);

        System.out.println(Arrays.toString(ar2));
    }
}
