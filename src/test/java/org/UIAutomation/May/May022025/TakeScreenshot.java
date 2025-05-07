package org.UIAutomation.May.May022025;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Personal\\uiautomation-selenium\\src\\screenshots\\"+generateFileDateStamp());
        FileHandler.copy(src, dest);
        driver.quit();

    }
    public static String generateFileDateStamp(){
        Date date = new Date();
        String fileName = date.toString().replace(":","_").replace(" ","_").concat(".png");
        return fileName;
    }
}
