package org.UIAutomation.February.Feb112026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQAAlert {

    //driver initialisation
    WebDriver driver;

    @Test
    public void alertTest() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id ='alertButton']")).click();
        WebElement headline = driver.findElement(By.xpath("//h1[text()='Alerts']"));

        if (headline.isDisplayed())
            Assert.assertTrue(true);
        else
            Assert.assertFalse(false);

        driver.quit();
       Alert alert = driver.switchTo().alert();
       alert.accept();
       Thread.sleep(2000);

//       WebElement headline = driver.findElement(By.xpath("//h1[text()='Alerts']"));
//
//       if (headline.isDisplayed())
//           Assert.assertTrue(true);
//       else
//           Assert.assertFalse(false);

       driver.quit();
    }


}
