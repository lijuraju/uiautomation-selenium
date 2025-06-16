package org.UIAutomation.June.June142025;

public class Exceptions extends Throwable {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
// This line is not executed because the previous line (System.out.println(10/0)) throws an ArithmeticException
// When an exception occurs, the execution flow immediately jumps to the matching catch block
// So this line is skipped since the code never reaches here due to the exception thrown by the division by zero
System.out.println("Priya".charAt(12));
        }

        catch (ArithmeticException ae){
            System.out.println("Aritmetic exception");
        }
        catch (java.lang.Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println();
        }
    }
}
