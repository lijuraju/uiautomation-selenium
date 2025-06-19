package org.UIAutomation.June.June192025;

public class ArrayPractice1 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,1,0,4};

        int largest = a[0];
        int smallest = a[0];

        for(int num : a){
            if(num> a[0]){
                largest=num;
            }
            else if (num < a[0]){
                smallest = num;
            }
        }
        System.out.println("Largest number is "+largest);
        System.out.println("Smallest number is "+smallest);
    }
}
