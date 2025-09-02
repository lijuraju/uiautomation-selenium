package org.UIAutomation.August.Aug272025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class ScrollingPagedemo1 {

    public static void main(String[] args) throws InterruptedException {

        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.executeScript("window.scrollBy(0,2000);","");


        WebElement btnPntMe = driver.findElement(By.xpath("//button[text()='Point Me']"));

//        driver.executeScript("arguments[0].scrollIntoView(true);",btnPntMe);


        driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        Thread.sleep(2);

    }
}
