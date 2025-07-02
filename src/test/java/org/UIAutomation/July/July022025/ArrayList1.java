package org.UIAutomation.July.July022025;

import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {

        List newObj = new ArrayList();
        newObj.add("Selenium");
        newObj.add("Selenium");//duplicates are allowed
        newObj.add("Playright");
        // ArrayList allows null values to be stored as elements
        newObj.add(null);// null represents the absence of a value
        System.out.println(newObj);

        System.out.println(newObj.get(0));//Accessing the element using indexing
        System.out.println(newObj.size());//to know the size of the aarrayList

        System.out.println(newObj.contains("Selenium"));//if contains it will return true

        newObj.add(1,"test");//To add the value at specified Index
        System.out.println(newObj);

        newObj.set(1,"Cypress");//Replaces the element at particular index
        System.out.println(newObj);

        newObj.remove(1);
        System.out.println(newObj);//Remove the element at particular index

        newObj.clear();
        System.out.println(newObj);//Clears all the element

    }
}
