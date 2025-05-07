package org.UIAutomation.May.May022025;

public class Swap2Strings3 {

    public static void main(String[] args) {

        String str1 = "Aleyamma";
        String str2 = "Raju";

        str1 = str1 + str2;//AleyammaRaju - 12

        str2 = str1.substring(0,str1.length() - str2.length());//AleyammaRaju - 12 - 4 = Aleyamma
        str1 = str1.substring(str2.length());

        System.out.println("str1: " + str1); // Output: str1: Raju
        System.out.println("str2: " + str2); // Output: str2: Aleyamma


    }
}
