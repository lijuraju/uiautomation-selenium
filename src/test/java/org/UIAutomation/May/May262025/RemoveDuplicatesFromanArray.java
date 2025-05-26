package org.UIAutomation.May.May262025;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromanArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,4,4,5};

        HashSet<Integer> uni = new HashSet<>();
        for(int n : arr){
            uni.add(n);
        }

        int[] resultarr = new int[uni.size()];
        int i =0;
        for(Integer element : uni)
        {
            resultarr[i++] = element;
        }

        System.out.println(Arrays.toString(resultarr));

    }
}
