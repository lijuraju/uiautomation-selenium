package org.UIAutomation.April.Apr032025;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Task10 {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver;

        File src = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\Personal\\uiautomation-selenium\\src\\screenshots\\screenshot.png");

        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot taken");

        driver.quit();






    }
}
