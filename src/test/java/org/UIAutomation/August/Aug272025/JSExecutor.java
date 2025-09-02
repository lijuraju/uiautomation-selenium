package org.UIAutomation.August.Aug272025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSExecutor {

    public static void main(String[] args) throws InterruptedException {


        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://testautomationpractice.blogspot.com/");

         WebElement txtboxName= driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));

         driver.executeScript("arguments[0].value='Liju';",txtboxName);

         Thread.sleep(2000);

         driver.quit();
    }
}
