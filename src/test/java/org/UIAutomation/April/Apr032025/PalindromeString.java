package org.UIAutomation.April.Apr032025;

public class PalindromeString {

    public static void main(String[] args) {

        String str = "Malayalam1";
        String str1 = str.toLowerCase();

        int left = 0;
        int right = str1.length() - 1;

        while(left < right){

            if (str1.charAt(left) != str1.charAt(right)){
                System.out.println(str + " is not a palindrome string.");
                break;
            }
            left++;
            right--;

        }
        System.out.println(str + " is a palindrome string.");
    }
}
