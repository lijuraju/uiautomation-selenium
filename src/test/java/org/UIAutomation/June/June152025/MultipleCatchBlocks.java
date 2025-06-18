package org.UIAutomation.June.June152025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try {
            System.exit(0);
            System.out.println(10 / 0);//Runtime exception
            Thread.sleep(10);// Compile time exception
            FileInputStream fis = new FileInputStream("abc");//compile time execution

        }
        catch (ArithmeticException | InterruptedException | FileNotFoundException ex)
        {
            System.out.println(ex.fillInStackTrace());
        }
        finally {
          throw new RuntimeException("test");
        }





    }
}
