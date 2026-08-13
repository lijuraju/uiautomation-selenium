package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Download4 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();


        WebElement btnDownload = driver.findElement(By.xpath("//span[text()='Download']"));
        btnDownload.click();


        File path = new File("C:\\Users\\320025295\\Downloads");

        File[] listofFiles = path.listFiles();

        for( File file : listofFiles)
        {

            if(file.getName().contains("TestLeaf"))
            {
                System.out.println("File Found");
                System.out.println("Name of file"+file.getName());
                break;
            }

            else
                System.out.println("File Not found");
        }

        driver.quit();
    }
}
