package org.UIAutomation.July.July022025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {
    public static void main(String[] args) {

        List newObj = new ArrayList();
        newObj.add("Liju");
        newObj.add("Reshma");
        newObj.add("Abram");

        for (int i = 0; i < newObj.size(); i++) {
            System.out.println(newObj.get(i));
        }

        for (Object test : newObj) {
            System.out.println(test);
        }


        ListIterator ltr = newObj.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }


        Iterator it = newObj.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator"+it.next());
        }
    }
}
