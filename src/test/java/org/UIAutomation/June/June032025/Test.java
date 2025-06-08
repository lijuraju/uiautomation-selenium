package org.UIAutomation.June.June032025;

class Parent {

//    Parent()
//    {
//        System.out.println("Parent");
//    }

    static {
        System.out.println("Parent Static block");
    }

    static void display(){
        System.out.println("Static method");
    }
}

class Child extends Parent{
static {
    System.out.println("Child");
}
}

public class Test{

    public static void main(String[] args) {
//        Child obj1 = new Child();
//        System.out.println("Main method");

        Parent.display();
    }
}


