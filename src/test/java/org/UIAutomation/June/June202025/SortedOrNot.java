package org.UIAutomation.June.June202025;

public class SortedOrNot {

    public static void main(String[] args) {

        int[] a ={1,2,3,1};
        boolean flag = true;
        for(int i=0; i<a.length-1;i++){

            if(a[i] >a[i+1]){
                flag = false;

                break;
            }
        }
        if(flag)
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }
}
