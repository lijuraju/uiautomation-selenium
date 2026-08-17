package org.UIAutomation.August.Aug172026;

import java.util.Arrays;

public class Compare2Arrays {

    public static void main(String[] args) {

        //Compare means content of the 2 arrays are same or not?


        int[] ar1 = {1,2,3,5};
        int[] ar2 ={1,2,3,4};


        int q  = Arrays.compare(ar1,ar2);

        System.out.println(q);
    }
}
