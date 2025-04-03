package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.manage().window().maximize();

        WebElement bt1 = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
        bt1.click();

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for(String windows : allWindows)
        {
            if(!parentWindow.equals(windows))
            {
                driver.switchTo().window(windows);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }

        Thread.sleep(2000);
        driver.switchTo().window(parentWindow);
        driver.quit();
    }
}
