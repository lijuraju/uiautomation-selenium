package org.UIAutomation.May.May242025;

public class LargestNumber {
    public static void main(String[] args) {

        int[] arr = {9,2,3,4,5};

        int max = arr[0];

        for(int i =1;i<=arr.length-1;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Largest number is "+max);
    }
}
