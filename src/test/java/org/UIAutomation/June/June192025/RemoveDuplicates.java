package org.UIAutomation.June.June192025;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //Array declaration
        int[] n = {1,1,2,2,3,3,100,200};

        //Declared a set which wont accept duplicates
        //Set is an interface which is implemented by HashSet

        Set obj = new HashSet();

        for(int i=0;i<n.length;i++){
            //if elements presents then it will return false
            if (obj.add(n[i])== false) {

                System.out.println("Duplicate"+n[i]);
            }
        }
    }
}
