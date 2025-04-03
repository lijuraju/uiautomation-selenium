package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement txtEmail = driver.findElement(By.id("email"));

        js.executeScript("arguments[0].setAttribute('value','lr@gmail.com')",txtEmail);

        WebElement txtPassword = driver.findElement(By.id("pass"));

        js.executeScript("arguments[0].setAttribute('value','123456')",txtPassword);

        WebElement btnLogin = driver.findElement(By.name("login"));

        js.executeScript("arguments[0].click()",btnLogin);

        Thread.sleep(2000);

        driver.quit();

    }
}
