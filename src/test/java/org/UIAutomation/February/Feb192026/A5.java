package org.UIAutomation.February.Feb192026;

import java.util.HashSet;
import java.util.Set;

public class A5 {

    public static void main(String[] args) {

        int[] a = {1,2,2,3,4,4,5};

        Set newObj = new HashSet();

        for( int b : a)
        {
            if(newObj.add(b) == false)

                System.out.println("Duplicate elemnet in array is"+a[b]);

        }
    }
}
