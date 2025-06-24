package org.UIAutomation.June.June202025;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

    public static void main(String[] args) {

        int[] a ={7,0,5,5,8,8};

        if(a.length<2){
            System.out.println("Invalid Array");
            return;
        }

        Arrays.sort(a);

        for(int i=a.length-2;i>=0;i--){
            if(a[i] != a[a.length-1]){
                System.out.println("The second largest number is"+a[i]);
                return;
            }
        }
        System.out.println("There is no second largest number");
    }
}
