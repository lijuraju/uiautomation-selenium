package org.UIAutomation.June.June202025;

public class DuplicateInArrayWithoutSet {

    public static void main(String[] args) {

        int[] a = {1,1,12,2,2,3,5,5,5};

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i] == a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
