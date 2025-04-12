package org.UIAutomation.April.Apr032025;

public class UniqueElementInanArray {
    public static void main(String[] args) {

        int[] array = {1,2,2,3,3,4,4,1,5};

        int result = 0;
        for(int num : array){

            result = result ^ num; //This is an XOR operation
            //first time it will be 0 ^ 1 = 1
            //second time it will be 1 ^ 2 = 3
            //third time it will be 3 ^ 2 = 1


        }
        System.out.println("the unique element in an array is" + result);
    }
}
