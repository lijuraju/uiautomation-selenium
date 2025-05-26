package org.UIAutomation.May.May242025;

public class SmallestNumber {
    public static void main(String[] args) {

        int[] arr = {9,2,3,4,5,1,0};
        int min = arr[0];

        for(int i =1;i<=arr.length-1;i++)
        {
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("Smallest number is"+min);
    }
}
