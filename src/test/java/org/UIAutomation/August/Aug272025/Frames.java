package org.UIAutomation.August.Aug272025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {


        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://ui.vision/demo/webtest/frames/");

        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Liju");

        Thread.sleep(2000);

        driver.switchTo().defaultContent();
    }
}
