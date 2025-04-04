package org.UIAutomation.April.Apr032025;

public class Swap2Numbers2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;


        a= a + b;
        b = a- b;
        a = a - b;

        System.out.println("After swapping: a = " + a);
        System.out.println("After swapping: b = " + b);
    }
}
