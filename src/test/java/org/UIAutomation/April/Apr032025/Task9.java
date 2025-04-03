package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://toolsqa.com/");
        driver.manage().window().maximize();

        WebElement scroll = driver.findElement(By.xpath("//a[text()='Read More']"));
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(false);", scroll);

        Thread.sleep(5000);

        driver.quit();

    }
}
