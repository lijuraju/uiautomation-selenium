package org.UIAutomation.July.July022025;

import java.util.*;

public class CountNoOfOccurences {

    public static void main(String[] args) {

        String str = "Malayalam";

          char[] ch = str.toCharArray();

              int count = 1;

            HashMap<Character, Integer> newObj = new HashMap<>();

            for(int i=0; i<ch.length;i++)
            {
                if(!newObj.containsKey(ch[i]))
                {
                    newObj.put(ch[i], count);
                }
                else
                {
                    newObj.put(ch[i], newObj.get(ch[i])+1);
                }
            }

            for(Character k: newObj.keySet())
            {
                System.out.println(k + " : " + newObj.get(k));
            }

    }
}
