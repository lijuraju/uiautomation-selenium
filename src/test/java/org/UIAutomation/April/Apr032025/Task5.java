package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger' and normalize-space(text()='click the button to display an  alert box:')]"));
        button.click();

        Thread.sleep(2000);

        Alert a = driver.switchTo().alert();

        a.accept();

        Thread.sleep(2000);

        driver.quit();
    }
}
