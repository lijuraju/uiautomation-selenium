package org.UIAutomation.April.Apr252025;

import java.util.Scanner;

public class SecondLargestInaGivenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int count = scanner.nextInt();

        if (count < 2) {
            System.out.println("You need to enter at least two numbers.");
            return;
        }

        int[] numbers = new int[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found (all numbers may be the same).");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }

        scanner.close();
    }

}
