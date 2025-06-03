package org.UIAutomation.May.May282025;

import java.util.Arrays;

public class ArrayReversal2 {

    public static void main(String[] args) {

        //Array declaration
        int[] arr = {10,11,12,13,14};

        int start =0;
        int end = arr.length-1;

        while (start<end) {

            //Swap the values
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));



    }

}
