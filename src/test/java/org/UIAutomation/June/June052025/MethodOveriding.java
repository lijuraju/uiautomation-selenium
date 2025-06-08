package org.UIAutomation.June.June052025;

public class MethodOveriding {

    void m3(){
        System.out.println("Parent method2");
    }

    void m1() {
        System.out.println("Parent method3");
    }
}

class child extends MethodOveriding{


    @Override
    void m1(){
        System.out.println("child method1");
    }
    void m2(){
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        child obj = new child();
        obj.m1();//I know all parent and all child methods

        MethodOveriding obj1 = new child();
        obj1.m3();//I know all parent methods and overriden methods only
                  //I don't know child specific method.

        MethodOveriding obj2 = new MethodOveriding();
        obj2.m1();//I only know parent methods

    }
}
