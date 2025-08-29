package org.UIAutomation.June.June272025;

import java.util.HashSet;

public class DuplicateCharactersInString {
    public static void main(String[] args) {

        String s = "abca";

        HashSet obj = new HashSet();
        for(int i= 0; i<s.length();i++){

            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j)){
                 obj.add(s.charAt(i));
                }
            }
        }
        System.out.println(obj);
    }
}
