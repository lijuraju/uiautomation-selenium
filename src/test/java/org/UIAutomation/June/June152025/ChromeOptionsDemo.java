package org.UIAutomation.June.June152025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--incognito");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex)
        {
            System.out.println(ex.fillInStackTrace());
        }

    }
}
