package org.UIAutomation.June.June192025;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
