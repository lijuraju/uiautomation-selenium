package org.UIAutomation.May.May022025;

public class Swap2String2 {

    public static void main(String[] args) {

        String str1 = "Good";//4
        String str2 = "morning";//7

        str1 = str1 + str2;
        System.out.println("Now Str1 is " + str1);//GoodMorning

        str2 = str1.substring(0,str1.length()-str2.length());//11-4 = Good
        str1 = str1.substring(str2.length());//Morning

        System.out.println("Now Str1 is " + str1);
        System.out.println("Now Str2 is " + str2);

    }
}
