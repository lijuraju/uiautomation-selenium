package org.UIAutomation.January.Jan2026.Jan272026;

import org.testng.annotations.*;

public class TestNGExecutionOrder {
    @Parameters("tester")
    @BeforeSuite
    public void beforeSuite(String tester)
    {
        System.out.println("Tester name from testng.xml"+tester);
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before TESTS execution");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class execution");
    }

    @Parameters("tester")
    @BeforeMethod
    public void beforeMethod(String test)
    {
        System.out.println("Before METHOD execution");
        System.out.println("Name"+test);
    }

    @Test
    public void testMethod1()
    {
        System.out.println("TestMethod  1");
    }

    @Test
    public void testMethod2()
    {
        System.out.println("TestMethod  2");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After METHOD execution");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class execution");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After TESTS execution");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After suite execution");
    }

}
