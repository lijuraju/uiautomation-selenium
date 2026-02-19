package org.UIAutomation.February.Feb192026;

public class A1Smalllargest {

    public static void main(String[] args){

        int[] array = {5,2,3,6,5,1};

        int largest = array[0];
        int smallest = array[0];

        for(int i =1; i<array.length;i++)
        {

            if(largest<array[i])

                largest = array[i];

        }

        for(int i =1; i<array.length;i++)
        {

            if(smallest>array[i])

                smallest = array[i];

        }

        System.out.println("The smallest number is "+ smallest);
        System.out.println("The smallest number is "+ largest);

    }
}
