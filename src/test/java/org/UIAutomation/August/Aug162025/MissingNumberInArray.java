package org.UIAutomation.August.Aug162025;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] array = {3,1,9,6,4};

        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length-1];

        // Create HashSet to store array elements
        HashSet<Integer> newObj = new HashSet<>();

        // Add all array elements to HashSet
        for(int num : array) {
            newObj.add(num);
        }

        // Check for missing numbers between min and max
        for(int i = min; i <= max; i++) {
            if(!newObj.contains(i)) {
                System.out.println("Missing number: " + i);
            }
        }



    }
}
