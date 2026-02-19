package org.UIAutomation.February.Feb192026;

import java.util.*;

public class A2 {

    public static void main(String[] args) {

        int[] a = {2,6,6,8,-1};

        if(a.length<2)
        {
            System.out.println("There is no second largest elemnet");
        }

        Arrays.sort(a);


        //int[] a ={1,2,4,6,8} length = 5
        //a[0]=1,a[1]=2,a[2]=4,a[3]=6,a[4]=8

        for(int i = a.length-2;i>=0;i--)
        {
            if(a[i] != a[a.length-1])
                System.out.println("The second largest elment is" + a[i]);

             return;
        }

    }

}
