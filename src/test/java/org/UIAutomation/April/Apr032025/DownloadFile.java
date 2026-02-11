package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadFile {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();

        WebElement btn = driver.findElement(By.xpath("//span[text()='Download']"));
        btn.click();

        File abc = new File("C:\\Users\\320025295\\Downloads");

      File [] listOfFiles = abc.listFiles();

      for(File file : listOfFiles)
      {
          if(file.getName().contains("TestLeaf"))
          {
              System.out.println(file.getName());
              System.out.println("File downloaded");
              break;
          }
          else
              System.out.println("File not found");
      }
      driver.quit();
    }
}
