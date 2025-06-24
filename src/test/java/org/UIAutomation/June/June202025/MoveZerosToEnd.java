package org.UIAutomation.June.June202025;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] a ={1,0,2,0,0,0,3};

        int zeroIndex  =0;

        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
                a[zeroIndex] = a[i];
                zeroIndex++;
            }
        }

        for(int j=zeroIndex;j<a.length;j++){
            a[j]=0;
        }

        System.out.println(Arrays.toString(a));
    }
}
