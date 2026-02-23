package org.UIAutomation.February.Feb232025;

public class StringPalindromeUsing2pointerapproach {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String temp)
    {
        char[] c = temp.toCharArray();
        int left = 0;
        int right = c.length-1;

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
        if(Character.toLowerCase(c[left]) != Character.toLowerCase(c[right]) )
        {
        return false;
        }
        left++;
        right--;
        }

        return  true;
    }
}
