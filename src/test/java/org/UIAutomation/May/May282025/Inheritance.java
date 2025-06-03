package org.UIAutomation.May.May282025;

public class Inheritance {
    int a;
    void method1(){
        System.out.println("Test");
    }
}

class Inheritance2 extends Inheritance{
    public static void main(String[] args) {
        Inheritance2 obj1 = new Inheritance2();
        obj1.method1();
        System.out.println(obj1.a);
    }

}
