package org.UIAutomation.June.June192025;

public class SumOfElementsInAnArray {

    public static void main(String[] args) {

        int[] arr = {5,10,5,10,100};
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("Sum of elements in an array is"+ sum);
    }
}
