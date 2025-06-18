package org.UIAutomation.June.June152025;

public class Throw {

    void age(int age){
        if(age <18){
            throw new ArithmeticException("tes");
        }
    }
    public static void main(String[] args) {

        int a = 10/0;
        throw new ArithmeticException("Divide by zero");
//       Throw ab = new Throw();
//       ab.age(10);
    }
}
