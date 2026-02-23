package org.UIAutomation.February.Feb232025;

public class ReverseAnArray {

    public static void main(String[] args) {


        int[] a = {1,2,3,4,5};

        int left =0;
        int right = a.length-1;
        int temp;

        while(left<right)
        {
            temp = a[left];
            a[left]=a[right];
            a[right]= temp;
            left++;
            right--;
        }
        for( int array : a)
        {
            System.out.println(array);
        }
    }
}
