package org.UIAutomation.July.July022025;

import java.util.Arrays;
import java.util.HashMap;

public class OccurencesOfWord {

    public static void main(String[] args) {

        String str ="Testing is manual testing or functional testing";

       String[] strArray = str.split(" ");
        int count = 1;

        HashMap<String, Integer> newObj = new HashMap<>();

        for(int i=0; i<strArray.length;i++)
        {
            if(!newObj.containsKey(strArray[i]))
            {
                newObj.put(strArray[i], count);
            }
            else
            {
                newObj.put(strArray[i], newObj.get(strArray[i])+1);
            }
        }

        for(String k: newObj.keySet())
        {
            System.out.println(k + " : " + newObj.get(k));
        }


    }
}
