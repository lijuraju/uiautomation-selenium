package org.UIAutomation.February.Feb022025;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test(retryAnalyzer = MyRetryAnalyzer.class)
    public void testRetry(){
        System.out.println("Test");
        Assert.assertTrue(false);
    }
}
