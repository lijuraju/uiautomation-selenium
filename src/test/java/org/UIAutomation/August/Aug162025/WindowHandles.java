package org.UIAutomation.August.Aug162025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
       WebElement window =  driver.findElement(By.id("opentab"));

       window.click();
       String parentWindowHandle = driver.getWindowHandle();
        System.out.println("First Parent"+parentWindowHandle);
       Set<String> handles= driver.getWindowHandles();

       for (String handle: handles)
       {
           if (!handle.equals(parentWindowHandle))
           {
               driver.switchTo().window(handle);
               System.out.println("Iam in childwindow");
               System.out.println(driver.getTitle());
               String parentWindowHandle1 = driver.getWindowHandle();
               System.out.println("Second Parent"+parentWindowHandle1);

           }

       }
       driver.quit();
    }
}
