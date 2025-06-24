package org.UIAutomation.June.June202025;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {

        //Bubble sort algorithm
        int[] a = {4,1,3,5,2};

        for(int i=0;i<a.length-1;i++){ // no: of pass

            for(int j=0;j<a.length-1;j++)// each pass iteration
            {
                if (a[j] > a[j +1]) {

                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;

                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
