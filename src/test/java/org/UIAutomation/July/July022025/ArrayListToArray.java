package org.UIAutomation.July.July022025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        List<String> newObj = new ArrayList();
        newObj.add("Selenium");
        newObj.add("Selenium");//duplicates are allowed
        newObj.add("Playright");

        String[] array = newObj.toArray(new String[0]);

        System.out.println(Arrays.toString(array));

    }
}
