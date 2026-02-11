package org.UIAutomation.January.Jan2026.Jan272026;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestNG1 {

    @Test
    public void sampleTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testng", Keys.ENTER);
        String actualtitle = driver.getTitle();
        String expectedTitle = "testng - Google Search";
        Thread.sleep(8000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
        softAssert.assertEquals(actualtitle,expectedTitle,"Title mismatch");
        driver.quit();
        softAssert.assertAll();



    }
}
