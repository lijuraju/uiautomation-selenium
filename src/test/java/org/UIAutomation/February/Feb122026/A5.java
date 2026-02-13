package org.UIAutomation.February.Feb122026;

public class A5 {
    public static void main(String[] args) {

        String s= "@Madam1&";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s)
    {
        char[] c = s.toCharArray();
        int left =0;
        int right= c.length-1;

        while(left<right)
        {

            while(left<right && !Character.isLetterOrDigit(c[left]))
            {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(c[right]))
            {
                right--;
            }
            if(Character.toLowerCase(c[left]) != Character.toLowerCase(c[right]))
            {
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }
}
