package org.UIAutomation.June.June202025;

public class TwoArryEqual {

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b ={1,2,3,4};

        boolean arrayEqual = true;

        if(a.length == b.length){

            for(int i=0;i<a.length;i++){
                if(a[i] != b[i]){
                    arrayEqual = false;
                }
            }

        }
        else
            arrayEqual = false;

        if (arrayEqual)
            System.out.println("Array is equal");
        else
            System.out.println("Array is not equal");
    }


}
