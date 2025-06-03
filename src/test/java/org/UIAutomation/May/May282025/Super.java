package org.UIAutomation.May.May282025;

public class Super {

    int a= 10;

    void parentMethod(){
        System.out.println("I am in parent method");
    }
}

class child  extends Super{

    int a =20;

    void childMethod(){
        System.out.println("I am in child method");
        System.out.println("Child class variable"+this.a);
        System.out.println("Parent class variable"+super.a);
    }

    public static void main(String[] args) {
        child obj1 = new child();
        obj1.childMethod();
        obj1.parentMethod();


    }


}
