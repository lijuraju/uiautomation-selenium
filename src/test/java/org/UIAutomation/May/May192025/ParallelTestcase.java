package org.UIAutomation.May.May192025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestcase {

    public static WebDriver driver;

    @BeforeMethod
    public void preSteps(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Test
    public void loginTest1(){

        driver.get("https://www.youtube.com/");
    }

    @Test
    public void loginTest2(){
        driver.get("https://gemini.google.com/");
    }

    @AfterMethod
    public void postSteps(){
        driver.quit();
    }
}
