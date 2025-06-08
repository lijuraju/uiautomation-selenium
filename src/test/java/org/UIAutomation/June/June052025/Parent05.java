package org.UIAutomation.June.June052025;

public class Parent05 {

    void display(){
        System.out.println("I am from Parent");
    }
}

class child05 extends Parent05{

//    @Override
//    void display(){
//        System.out.println("I am from Child");
//    }

    public static void main(String[] args) {
        Parent05 obj = new child05();
        obj.display();


    }
}
