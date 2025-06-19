package org.UIAutomation.June.June152025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowExample2 {

    public static void main(String[] args) throws FileNotFoundException {
       try {
           FileInputStream fis = new FileInputStream("abc.txt");
       }catch (FileNotFoundException e) {
           throw new FileNotFoundException("Please see file and do it!!!");
       }

    }
}
