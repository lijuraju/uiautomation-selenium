package org.UIAutomation.June.June142025;

public interface Test01 {

    int add(int a, int b); //not only void other return types are also possible

    default int substract(int a, int b)
    {
        return  a-b;
    }

    default int substract(int a, int b, int c){  //overloading of default methods is possible
        return a- b -c ;
    }

    static int multiply(int a , int b){
        return a * b;
    }

    static int multiply(int a, int b, int c){ //overloading of static methods is possible
        return a * b * c;
    }

    class A  implements Test01{

        public int add(int a, int b){
            return a + b;
        }



    }

public class Main{

    public static void main(String[] args) {

        Test01 obj = new A();

        obj.add(10,20);
        obj.substract(20,10);
        Test01.multiply(10,20);// static methods have to be called by Interface name.
    }
}

}

