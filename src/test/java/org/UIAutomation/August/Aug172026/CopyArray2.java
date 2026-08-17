package org.UIAutomation.August.Aug172026;

import java.util.Arrays;

public class CopyArray2 {

    public static void main(String[] args) {


        int[] ar1 = {10,20,30,40,50};//Declare the array
        //int[] ar2 = new int[ar1.length]; //Declare the second array

        int[] ar2 = Arrays.copyOf(ar1,ar1.length); // Use copy function

        System.out.println(Arrays.toString(ar2));

        ar2[0]=100;

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));



    }
}
