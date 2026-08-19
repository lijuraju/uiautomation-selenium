package org.UIAutomation.August.Aug172026;

public class Comapre2ArraysLogic {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {0, 2, 3, 4};

        boolean equal = true;

        if (ar1.length != ar2.length) {
            equal = false;
        } else
            for (int i = 0; i <= ar1.length - 1; i++) {
                if (ar1[i] != ar2[i]) {
                    equal = false;
                    break;
                }

            }

        if (equal)
            System.out.println("Both arrays are equal");
        else
            System.out.println("Both arrays are not equal");

    }
}
