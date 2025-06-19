package org.UIAutomation.June.June192025;

public class LargestElementInanArray {
    public static void main(String[] args) {

        int[] test = {5,10,2,100,0,-1};
        int max = test[0];

        for(int num : test){
            if(max<num){
                max = num;
            }
        }
        System.out.println("Largest number in an array is "+max);
    }
}
