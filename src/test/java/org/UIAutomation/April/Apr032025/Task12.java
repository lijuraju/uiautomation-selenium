package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");

        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        WebElement h = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        h.click();
        Thread.sleep(2000);
        h.getText();

        System.out.println(h.getText());

        driver.switchTo().defaultContent();


        driver.switchTo().frame("frame1");

        WebElement h2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        h2.click();
        Thread.sleep(2000);
        h2.getText();

        System.out.println(h.getText());

        driver.quit();


    }
}
