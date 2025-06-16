package org.UIAutomation.June.June112025;

public interface Test {
    default void logerror(){
        System.out.println("test");
    }

    static void internal(){
        System.out.println("test");
    }
}
