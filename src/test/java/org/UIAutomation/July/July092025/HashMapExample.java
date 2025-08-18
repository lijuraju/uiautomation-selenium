package org.UIAutomation.July.July092025;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

   HashMap map = new HashMap();
   map.put("A", "1");
   map.put("A","2");
   map.put("B", "3");

     Set s = map.keySet();

        Iterator it = s.iterator();

        while(it.hasNext()){

             String s1 = it.next().toString();
             System.out.println(map.get(s1));
        }

    }
}
