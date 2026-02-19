package org.UIAutomation.February.Feb192026;

import java.util.*;

public class A4 {

    public static void main(String[] args) {


        int[] a = {5,23,1,-1,0,6};
        //-1,0,1,5,6,23
        int temp;

        for( int i =0; i<a.length-1; i++)
        {
            for(int j =0; j<a.length-1; j++)
            {

                if(a[j]> a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;

                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
