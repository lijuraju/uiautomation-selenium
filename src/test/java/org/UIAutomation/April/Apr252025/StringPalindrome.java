package org.UIAutomation.April.Apr252025;

public class StringPalindrome {

    public static void main(String[] args) {

        String str = "Malayalam1";
        str = str.toLowerCase();
        boolean isPalindrome = true;

        int left = 0;
        int right = str.length() -1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right))
            {
                isPalindrome = false;
                break;
            }
            left++;
            right--;

        }
        if(isPalindrome)
            System.out.println(str + " is a palindrome string.");
        else
            System.out.println(str + " is not a palindrome string.");
    }

}
