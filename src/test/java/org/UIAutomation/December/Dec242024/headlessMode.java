package org.UIAutomation.December.Dec242024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class headlessMode {

    @Test
    public void headlessMode() {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        ChromeDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
