package org.UIAutomation.June.June202025;

import java.util.Arrays;

public class ReverseAnArrayWhile {

    public static void main(String[] args) {

        int[] a ={1,2,3};

        int i=0;
        int j=a.length-1;
        int temp;

        while(i<j){

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
