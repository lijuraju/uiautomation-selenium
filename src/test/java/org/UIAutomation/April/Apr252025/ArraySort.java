package org.UIAutomation.April.Apr252025;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 1: Sort the array
        Arrays.sort(numbers); // Sorts in ascending order

        // Step 2: Traverse from the end to find second largest unique value
        int largest = numbers[4];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 3; i >= 0; i--) {
            if (numbers[i] < largest) {
                secondLargest = numbers[i];
                break;
            }
        }

        // Step 3: Display result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found (all numbers may be the same).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }

        scanner.close();
    }
}
