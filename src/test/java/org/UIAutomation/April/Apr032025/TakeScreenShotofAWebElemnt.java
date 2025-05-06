package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenShotofAWebElemnt {

    public static void main(String[] args) throws IOException {

        WebDriver driver;

        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

//        TakesScreenshot ts = (TakesScreenshot) driver;
//
//        File src = ts.getScreenshotAs(OutputType.FILE);


        WebElement img = driver.findElement(By.xpath("//img[@alt='Google' and @class ='lnXdpd']"));
       File src = img.getScreenshotAs(OutputType.FILE);
       File dest = new File("C:\\Personal\\uiautomation-selenium\\src\\screenshots\\"+generateFileDateStamp());
       FileHandler.copy(src, dest);

       driver.quit();

//       TakesScreenshot ts1 = (TakesScreenshot) driver;
//
//      File src1 =  ts1.getScreenshotAs(OutputType.FILE);
//      File dest1 = new File("C:\\Personal\\uiautomation-selenium\\src\\screenshots\\"+generateFileDateStamp());
//      FileHandler.copy(src1, dest1);

    }

    public static String generateFileDateStamp(){

        Date date = new Date();

       String fileName = date.toString().replace(":","_").replace(" ","_").concat(".png");
       return fileName;

        }

    }


