package org.UIAutomation.August.Aug162025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks2 {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");

      List<WebElement> links = driver.findElements(By.xpath("/a"));

      for(WebElement link : links)
      {

          String url =  link.getAttribute("href");

          URL correctURL = new URL(url);

          HttpURLConnection connection = (HttpURLConnection) correctURL.openConnection();

          connection.connect();

           int responsecode = connection.getResponseCode();

           if(responsecode == 200)
           {
               System.out.println("valid link"+ correctURL);
           }
           else
               System.out.println("Inavlid link"+correctURL);


      }
      driver.quit();
    }
}
