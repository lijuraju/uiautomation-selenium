package org.UIAutomation.June.June152025;

public class Constructor {
    Constructor(){
        System.out.println("No-Arg Constructor");
    }
    Constructor(int a){
        System.out.println("Single Parameter Constructor");
    }
    Constructor(int a,int b){
        this();
        //this(10);//2 constructor calling are not allowed
        System.out.println("Double Parameter Constructor");
    }
    public static void main(String[] args) {
        Constructor newObj = new Constructor(10,12);
    }

}
