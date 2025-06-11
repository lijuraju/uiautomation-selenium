package org.UIAutomation.June.June052025;

public class Test09 {
    
}
class child1 extends Test09{
    static {
        System.out.println("Second static block");
    }
}

class  child2 extends Test09{
    static {
        System.out.println("Third static block");
    }

    private class m3{

    }

    public static void main(String[] args) {
        System.out.println("In main method");


    }
}
