package org.UIAutomation.July.July022025;

import java.util.*;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String[] array = {"liju","Abram"};

        List newObj = new ArrayList(Arrays.asList(array));

        System.out.println(newObj);
    }
}
