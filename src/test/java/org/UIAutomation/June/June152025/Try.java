package org.UIAutomation.June.June152025;

public class Try {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch (ArithmeticException ex){
            //System.out.println(ex.fillInStackTrace());
            throw ex;
        }finally {
            System.out.println("I am in final block");
        }
        System.out.println("I am out of try catch");
    }
}
