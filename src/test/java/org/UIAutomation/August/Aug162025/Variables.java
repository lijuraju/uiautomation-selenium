package org.UIAutomation.August.Aug162025;

public class Variables {

    int x;

    public void increment(){
        x++;
    }

    public static void main(String[] args) {

        Variables newObj = new Variables();
        newObj.increment();
        System.out.println(newObj.x);
        Variables newObj2 = new Variables();
        System.out.println(newObj2.x);



    }

//    public void  testMethod(){
//        int a, b;
//
//        int sum = a +b ;
//
//    }
}
