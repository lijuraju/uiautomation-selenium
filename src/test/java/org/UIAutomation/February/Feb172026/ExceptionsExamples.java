package org.UIAutomation.February.Feb172026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsExamples {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.findElement(By.xpath("//input[@class='test']"));
    }
}
