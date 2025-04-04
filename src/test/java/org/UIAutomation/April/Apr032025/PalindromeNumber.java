package org.UIAutomation.April.Apr032025;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 1210;

        int reversedNum = 0;

        int originalNum = num;

        while (num != 0) {
            int lastdigit = num % 10;
            reversedNum = reversedNum * 10 + lastdigit;
            num = num / 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        }
        else
            System.out.println(originalNum + " is not a palindrome number.");
    }
}
