package org.UIAutomation.May.May262025;

public class StaticMethod {

    static void block()
    {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        //without creating a object I executed the Java
        StaticMethod.block();
    }
}
