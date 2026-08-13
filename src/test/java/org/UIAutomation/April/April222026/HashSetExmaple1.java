package org.UIAutomation.April.April222026;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmaple1 {

    public static void main(String[] args) {

        HashSet obj1 = new HashSet();

        obj1.add("2");
        obj1.add("3");
        obj1.remove("2");
        obj1.add("4");
        obj1.add("5");

       // System.out.println(obj1);

        for ( Object a : obj1)
        {
            System.out.println(a);
        }

        Iterator<Integer> it = obj1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
