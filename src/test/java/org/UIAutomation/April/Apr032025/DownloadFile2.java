package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadFile2 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();

        WebElement btn = driver.findElement(By.xpath("//span[text()='Download']"));

        btn.click();

        File abc = new File("C:\\Users\\320025295\\Downloads");

        File[] listOfFiles = abc.listFiles();
        boolean found = false;

        for(File list : listOfFiles)
        {
            if(list.getName().contains("TestLeaf"))
            {
                System.out.println(list.getName());
                System.out.println("File found");
                found = true;
                break;
            }
        }
        
        if(!found)
        {
            System.out.println("File Not found");
        }
        driver.quit();

    }
}
