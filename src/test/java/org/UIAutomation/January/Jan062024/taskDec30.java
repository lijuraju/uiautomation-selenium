package org.UIAutomation.January.Jan062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class taskDec30 {

@Test
public void verifyMessage() throws InterruptedException {

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.idrive360.com/enterprise/login");
    Thread.sleep(5000);


    WebElement uName = driver.findElement(By.xpath("//input[@id ='username']"));
    uName.sendKeys("augtest_040823@idrive.com");

    WebElement pwd = driver.findElement(By.xpath("//input[@id ='password']"));
    pwd.sendKeys("123456");

    WebElement login = driver.findElement(By.id("frm-btn"));
    login.click();

    Thread.sleep(18000);

    String message = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']")).getText();


    Assert.assertEquals(message,"Your free trial has expired");
    driver.quit();


}
}
