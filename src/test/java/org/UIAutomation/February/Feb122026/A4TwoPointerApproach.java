package org.UIAutomation.February.Feb122026;

public class A4TwoPointerApproach {
    public static void main(String[] args) {

        String input = "liju";

        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(String input) {

        char[] array = input.toCharArray();

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(array[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(array[right])) {
                right++;
            }

            if (Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
                return false;
            }
            left++;
            right--;
        }

        return  true;

    }
}
