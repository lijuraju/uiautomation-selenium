package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shopclues.com/wholesale.html");
        driver.manage().window().maximize();

        Actions a = new Actions(driver);

        WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));

        a.moveToElement(sports).perform();

        Thread.sleep(-3000);

        WebElement weightgainer = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
        weightgainer.click();

        driver.quit();
    }
}
