package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        Actions a = new Actions(driver);

        WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));

        WebElement dest1 = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
        WebElement dest2 = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));

        a.dragAndDrop(source1,dest1).perform();

        a.dragAndDrop(source2,dest2).build().perform();
        Thread.sleep(3000);

        driver.quit();



    }
}
