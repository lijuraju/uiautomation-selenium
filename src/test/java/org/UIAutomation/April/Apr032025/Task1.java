package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {




    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println("Title of the page is: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("URLis"+url);

        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);
        Thread.sleep(5000);

        driver.quit();
    }
}
