package org.UIAutomation.June.June032025;

public final class MethodOverloading {

    void test(int a){
        System.out.println("1 parameter");
    }

    void test(int a, String b){
        System.out.println("2 paramter");
    }

    void test(String a, int b){
        System.out.println("Order of parameter");
    }

    public static void main(String[] args) {
        MethodOverloading obj1 = new MethodOverloading();
        obj1.test(1);
        obj1.test("a",1);
    }
}
