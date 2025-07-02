package org.UIAutomation.July.July022025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList3 {

    public static void main(String[] args) {

        List newObj = new ArrayList(Arrays.asList("Liju","Reshma"));

        List newObj1 = new ArrayList();
        newObj1.add("Liju");
        List newObj2 = new ArrayList();
        newObj2.add("Reshma");

        newObj1.addAll(newObj2);

        System.out.println(newObj1);


    }
}
