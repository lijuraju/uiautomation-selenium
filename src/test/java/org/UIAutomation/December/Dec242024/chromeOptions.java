package org.UIAutomation.December.Dec242024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class chromeOptions {

    @Test
    public void chromeOptions() {

        ChromeOptions edgeOptions = new ChromeOptions();
        //edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addArguments("--incognito");


        ChromeDriver driver = new ChromeDriver(edgeOptions);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }

}
