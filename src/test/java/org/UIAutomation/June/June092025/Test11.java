package org.UIAutomation.June.June092025;

public abstract class Test11 {

    abstract void m1();

    void n1(){

    }
}

abstract class Test12 extends Test11{

    abstract void m2();
}

class Test13 extends Test12{


    @Override
    void m2() {
        System.out.println("test1");
    }

    @Override
    void m1() {
        System.out.println("test4");
    }

    public static void main(String[] args) {
        Test13 a = new Test13();



    }
}
