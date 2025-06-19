package org.UIAutomation.June.June192025;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3,};
        int[] b = {4, 5, 6};

        int[] combine = new int[a.length + b.length];

     for(int i=0;i<a.length;i++)
        {
            combine[i] = a[i];
        }
        for(int j=0; j<b.length;j++){

            combine[a.length+j] = b[j];
        }
        System.out.println(Arrays.toString(combine));
    }
}
