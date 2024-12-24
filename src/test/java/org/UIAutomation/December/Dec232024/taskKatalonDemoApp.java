package org.UIAutomation.December.Dec232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class taskKatalonDemoApp {

    @Test
    public void createAppointment(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();


       WebElement appmntButton = driver.findElement(By.id("btn-make-appointment"));
       appmntButton.click();

       WebElement uname = driver.findElement(By.id("txt-username"));
       uname.sendKeys("John Doe");


        WebElement pwd = driver.findElement(By.id("txt-password"));
        pwd.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.id("btn-login"));
        login.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        System.out.println("Passed");

        driver.quit();




    }
}
