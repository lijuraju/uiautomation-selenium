package org.UIAutomation.December.Dec242024;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class adBlocker {

    @Test
    public void createAppointment() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/test/java/org/UIAutomation/December/Dec242024/adblock.crx"));



        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://youtube.com");

        Thread.sleep(5000);

        driver.quit();



    }
}
