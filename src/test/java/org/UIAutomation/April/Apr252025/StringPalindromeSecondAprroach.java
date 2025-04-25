package org.UIAutomation.April.Apr252025;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class StringPalindromeSecondAprroach {
    public static void main(String[] args) {


        String str = "malayalAM";
        String reversed = "";
        String orgstr = str.toLowerCase();

        for(int i=str.length()-1;i>=0;i--){
            reversed = reversed + orgstr.charAt(i);
        }

        if(orgstr.equals(reversed)) {
            System.out.println(str + " is a palindrome string.");
        }
            else
            System.out.println(str + " is not a palindrome string.");
    }
}
