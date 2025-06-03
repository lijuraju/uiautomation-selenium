package org.UIAutomation.May.May282025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2);
        String text = "sunday";

        WebElement chkBox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='"+text+"']"));
        chkBox.click();
        Thread.sleep(10);



    }
}
