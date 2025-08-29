package org.UIAutomation.August.Aug272025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestThrow {

    public static void main(String[] args) throws FileNotFoundException {

       try {
           FileInputStream fis = new FileInputStream("abc.text");
       }
       catch ( FileNotFoundException e)
       {
        throw new FileNotFoundException("Check the file");
       }
    }
}
