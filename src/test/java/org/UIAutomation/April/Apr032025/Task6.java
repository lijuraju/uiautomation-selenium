package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();

        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary' and normalize-space(text()='click the button to display a confirm box ')]"));
        button.click();

        Thread.sleep(2000);

        Alert a = driver.switchTo().alert();

        a.dismiss();

        Thread.sleep(2000);

        driver.quit();
    }
    }

