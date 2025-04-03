package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Task4 {

    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://greenstechnologys.com/");

        driver.manage().window().maximize();

        Actions a = new Actions(driver);

        Robot r = new Robot();

        WebElement para = driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;'][2]"));

        a.doubleClick(para).perform();

        a.contextClick(para).perform();


        Thread.sleep(2000);

        //for using down key
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        Thread.sleep(2000);

        //for using Enter key
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);

        driver.quit();



    }
}
