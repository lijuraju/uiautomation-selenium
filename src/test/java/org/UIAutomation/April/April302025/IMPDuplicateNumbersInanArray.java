package org.UIAutomation.April.April302025;

import java.util.HashSet;

public class IMPDuplicateNumbersInanArray {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,5};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(seen.contains(num)) {
                duplicates.add(num);
            }
            else {
                seen.add(num);
            }
        }
        for(int dup : duplicates){
            System.out.println(dup + " is a duplicate number.");
        }
    }
}
