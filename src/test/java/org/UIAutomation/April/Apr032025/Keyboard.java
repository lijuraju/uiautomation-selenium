package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.manage().window().maximize();

        WebElement txtbox1 = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement txtbox2 = driver.findElement(By.xpath("//input[@id='lastName']"));

        txtbox1.sendKeys("liju");

        Actions a = new Actions(driver);

        a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        a.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);

        txtbox2.click();
        a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Thread.sleep(5000);

        driver.quit();






    }
}
