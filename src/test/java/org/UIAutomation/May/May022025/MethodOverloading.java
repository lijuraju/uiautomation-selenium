package org.UIAutomation.May.May022025;

public class MethodOverloading {

    public static void main(String[] args) {
       MethodOverloading m = new MethodOverloading();
       m.result(10,5);
       m.result(1.5,2.5);
    }

    public int result(int a,int b)
    {
        int result = a + b;
        System.out.println("Integer");
        return result;
    }

    public double result(double a , double b) {

        double result = a + b;

        System.out.println("overloaded double method");

        return result;

    }
}
