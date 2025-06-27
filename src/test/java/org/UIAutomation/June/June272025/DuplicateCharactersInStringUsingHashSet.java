package org.UIAutomation.June.June272025;

import java.util.HashSet;

public class DuplicateCharactersInStringUsingHashSet {

    public static void main(String[] args) {

        String s = "malayalam";

        char[] a =  s.toCharArray();

        HashSet obj = new HashSet();

        for(char c : a){
            if(obj.add(c) == false){

            }
        }
        System.out.println(obj);


    }
}
