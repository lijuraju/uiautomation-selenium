package org.UIAutomation.June.June272025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class Yatra {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //WebDriver is a Interface.
        //Interface means set contracts that child class must implement
        //driver is a reference variable
        //ChromeDriver is a class which implements WebDriver methods
        //new ChromeDriver is the object creation part.
        //In Java we always create objects of child class

        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();

        By dateButtonLocator = By.xpath("//div[@aria-label='Departure Date inputbox']");

// Using WebDriverWait to wait for element to be clickable before finding it
        WebElement dateButton = wait.until(ExpectedConditions.elementToBeClickable(dateButtonLocator));

        dateButton.click();

      By monthLocator =  By.xpath("//div[@class='react-datepicker__month-container']");

       List<WebElement> monthLocators = driver.findElements(monthLocator);
       System.out.println(monthLocators.size());

        Thread.sleep(2000);

        driver.quit();


    }
}
