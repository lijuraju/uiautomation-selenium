package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();

        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-info' and normalize-space(text()='click the button to demonstrate the prompt box ')]"));
        button.click();

        Thread.sleep(2000);

        Alert a = driver.switchTo().alert();


        a.sendKeys("Liju");
        System.out.println(a.getText());
        a.accept();

        Thread.sleep(2000);

        driver.quit();
    }
}
