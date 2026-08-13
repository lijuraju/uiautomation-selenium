package org.UIAutomation.February.Feb242026;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File myImage = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("src/test/java/org/UIAutomation/February/Feb242026/t1.png");

        FileUtils.copyFile(myImage,destination);

        driver.quit();
    }
}
