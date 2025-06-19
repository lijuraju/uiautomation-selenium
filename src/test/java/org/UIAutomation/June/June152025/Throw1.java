package org.UIAutomation.June.June152025;

public class Throw1 {

    static void test() {

            int a = 10 / 0;

    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
