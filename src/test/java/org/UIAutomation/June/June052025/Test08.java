package org.UIAutomation.June.June052025;

public class Test08 {

static {
    System.out.println("Static block");
}

static void  test(){

    System.out.println("method");

}

}

class B extends Test08{

    public static void main(String[] args) {

    }
}

class MyJavaClass {

    // Static fields
    public static int staticCounter;
    public static final String CLASS_NAME; // Conventionally final static fields are uppercase

    // Static initialization block
    static {
        System.out.println("Static initialization block called!");
        staticCounter = 0; // Initialize static counter
        CLASS_NAME = "MyJavaClassDefinition"; // Initialize static final field
        // Any other one-time setup code can go here
    }

    // Instance fields
    public int instanceId;

    // Instance Constructor
    public MyJavaClass(int id) {
        this.instanceId = id;
        staticCounter++; // Increment static counter every time an instance is created
        System.out.println("Instance constructor called for ID: " + instanceId);
    }

    public void doSomething() {
        System.out.println("Instance " + instanceId + " doing something. StaticCounter: " + staticCounter);
    }

    public static void main(String[] args) {
        System.out.println("Before creating any instance or accessing static members.");

        // Accessing a static member (triggers static block if not already called)
        System.out.println("Class Name: " + MyJavaClass.CLASS_NAME);

        MyJavaClass obj1 = new MyJavaClass(1); // Calls static block (if not already called) then instance constructor
        MyJavaClass obj2 = new MyJavaClass(2); // Calls instance constructor only
        MyJavaClass obj3 = new MyJavaClass(3); // Calls instance constructor only

        obj1.doSomething();
        obj2.doSomething();

        // Accessing static counter directly
        System.out.println("Final Static Counter: " + MyJavaClass.staticCounter);
    }
}

