package org.UIAutomation.July.July022025;

import java.util.HashMap;

import static java.lang.reflect.Array.get;

public class Occu2 {

    public static void main(String[] args) {

        String s = "Apple";

        char[] ch = s.toCharArray();

        int count =1;

        HashMap<Character,Integer> newObj = new HashMap<>();

        for(int i=0; i<ch.length; i++)
        {
            if(!newObj.containsKey(ch[i])){

                newObj.put(ch[i],count);
            }
            else
                newObj.put(ch[i],newObj.get(ch[i])+1);

        }
        for(Character key : newObj.keySet())
        {
            System.out.println(key + "  " + newObj.get(key));
        }
    }
}
