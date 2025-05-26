package org.UIAutomation.May.May122025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class TabNavigation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.credly.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.udemy.com/");

        Set<String> windowHandles = driver.getWindowHandles();

        ArrayList<String> tabIndex = new ArrayList<>(windowHandles);

        System.out.println("No.of Tabs "+tabIndex.size());

        //FirstTab
        driver.switchTo().window(tabIndex.get(0));
        System.out.println("First tab"+driver.getTitle());

        //Secondtab
        driver.switchTo().window(tabIndex.get(1));
        System.out.println("Second tab"+driver.getTitle());

        //Thirdtab
        driver.switchTo().window(tabIndex.get(2));
        System.out.println("Third tab"+driver.getTitle());

        //SecondTab
        driver.switchTo().window(tabIndex.get(1));
        System.out.println("Second tab"+driver.getTitle());

        Thread.sleep(3000);

        driver.quit();

    }
}
