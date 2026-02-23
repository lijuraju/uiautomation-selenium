package org.UIAutomation.February.Feb232025;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {
        String[] s = {"Liju","How","are","you","Liju"};

        int left=1;
        int right = s.length-2;

        while(left<right)
        {
            String temp = s[left];
            s[left]= s[right];
            s[right]= temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(s));

    }
}
