package org.UIAutomation.June.June272025;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateCharacterInaString2 {
    public static void main(String[] args) {

        String str = "philips";
        char[] a =  str.toCharArray();

        HashSet obj = new HashSet();
        for(int i =0; i<str.length();i++){
            for(int j =i+1; j<str.length();j++){

                if(a[i] == a[j]){
                    obj.add(a[i]);


                }

            }

        }
        System.out.println(obj);


    }
}
