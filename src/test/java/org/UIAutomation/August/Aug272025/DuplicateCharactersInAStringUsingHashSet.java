package org.UIAutomation.August.Aug272025;

import java.util.HashSet;

public class DuplicateCharactersInAStringUsingHashSet {

    public static void main(String[] args) {


        String s= "aabccd";

        char[] c = s.toCharArray();

        HashSet newObj = new HashSet();
        HashSet duplicates = new HashSet();


        for(char ch : c)
        {

            if(!newObj.add(ch)){

                duplicates.add(ch);

            }


        }
        System.out.println(duplicates);
    }
}
