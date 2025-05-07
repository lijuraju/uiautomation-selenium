package org.UIAutomation.May.May022025;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsTab2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open('https://www.amazon.com');");

        String currentHandle = driver.getWindowHandle();

        Set<String> windowhandles = driver.getWindowHandles();

        for(String handle : windowhandles){

            if(!handle.equals(currentHandle)){
                driver.switchTo().window(handle);
                System.out.println("Title of the new window is: " + driver.getTitle());

                // Close the new window after printing the title
                driver.close();
            }
        }

        Thread.sleep(2000);
        driver.close();

    }
}
