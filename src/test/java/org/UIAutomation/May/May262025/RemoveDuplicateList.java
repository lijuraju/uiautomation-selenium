package org.UIAutomation.May.May262025;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateList {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};

        //Declare a arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();

        //for loop for iterating elements
        for(int i=0;i<arr.length;i++)
        {
            //condition check
            if(arrayList.contains(arr[i]))
            {
                continue;
            }
            else
                arrayList.add(arr[i]);
        }

        //new array to store unique elements
        int[] resultarr = new int[arrayList.size()];
        int i= 0;
        for(Integer num: arrayList)
        {
            resultarr[i] = num;
            i=i+1;
        }

        System.out.println(Arrays.toString(resultarr));
    }
}
