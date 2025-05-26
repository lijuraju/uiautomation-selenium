package org.UIAutomation.May.May242025;

import java.util.HashSet;

public class FindoutDuplicatesInAnArray {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,4,5,5,5,};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(seen.contains(num))
            {
                duplicates.add(num);
            }
            else
                seen.add(num);
        }

        for(int dup : duplicates)
        {
            System.out.println(dup+" is a duplicate number in the array");
        }
    }
}
