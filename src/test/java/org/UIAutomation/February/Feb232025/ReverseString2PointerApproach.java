package org.UIAutomation.February.Feb232025;

public class ReverseString2PointerApproach {

    public static void main(String[] args) {

        String a = "Liju";
        char[] c = a.toCharArray();
        int left = 0;
        int right = c.length-1;

        while(left<right)
        {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;


        }
        System.out.println(c);
    }
}
