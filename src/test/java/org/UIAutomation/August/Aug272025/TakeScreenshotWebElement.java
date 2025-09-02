package org.UIAutomation.August.Aug272025;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshotWebElement {

    public static void main(String[] args) throws IOException {


        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

         WebElement btnStart = driver.findElement(By.xpath("//button[text()='START']"));

          File srcElem = btnStart.getScreenshotAs(OutputType.FILE);

          File dest = new File("C://Personal//uiautomation-selenium//src//test//java//org//UIAutomation//August//Aug272025/"+ getTimeStamp());

        FileUtils.copyFile(srcElem,dest);


    }

    public  static String getTimeStamp(){

        Date date = new Date();
         String fileName = date.toString().replace(":","_").replace(" ","_").concat(".png");
         return fileName;

    }

}
