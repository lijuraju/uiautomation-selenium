package org.UIAutomation.February.Feb022025;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 2;


    @Override
    public boolean retry(ITestResult iTestResult) {

        if(retryCount<maxRetryCount){
            retryCount++;
            //System.out.println("Retrying test " + result.getName() + ", Attempt " + retryCount); // Helpful logging
            return true; // Yes, retry the test
        }
        else {
            return false;
        }
    }
}
