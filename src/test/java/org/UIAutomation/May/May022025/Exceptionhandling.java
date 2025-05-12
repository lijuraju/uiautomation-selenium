package org.UIAutomation.May.May022025;

public class Exceptionhandling {

    public static void main(String[] args) {

      try {
          int result = 10 / 0;
          System.out.println(result);
      }

      catch (ArithmeticException e) {
          System.err.println(e.getMessage());
      }
      finally {
          System.gc();
          System.out.println("I will always run");
      }

    }
}
