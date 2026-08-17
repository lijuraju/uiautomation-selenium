package org.UIAutomation.August.Aug172026;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {


        int[] ar1 = {10,20,30,40,50};//Declare the array

        int[] ar2 = new int[ar1.length]; //Declare the second array

        for(int i =0;i<=ar1.length-1;i++) // for loop
        {
          ar2[i] =    ar1[i]; //copy the array
        }
        System.out.println(Arrays.toString(ar2));// display
    }
}
