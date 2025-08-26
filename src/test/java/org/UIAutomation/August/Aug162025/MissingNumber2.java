package org.UIAutomation.August.Aug162025;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber2 {

    public static void main(String[] args) {

        int[] array = {4,9,3};

        Arrays.sort(array);

        HashSet newObj = new HashSet();

        for(int num : array)
        {
            newObj.add(num);
        }

        int min = array[0];
        int max = array[array.length -1];

        for(int i= min; i<= max;i++)
        {
            if(!newObj.contains(i))
            {
                System.out.println("Missing number"+ i);
            }
        }
    }
}
