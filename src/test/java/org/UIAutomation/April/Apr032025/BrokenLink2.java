package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class BrokenLink2 {

    public static void main(String[] args) throws IOException {

     WebDriver driver;
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.hyrtutorials.com/");


         // Find all links on the page
     List<WebElement> links =  driver.findElements(By.tagName("a"));
     for(WebElement link : links)
     {
         //Get the URL of the link
         String url = link.getDomAttribute("href");
            System.out.println("Link: " + url);

         HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
         connection.setRequestMethod("GET");
         connection.connect();
         int responseCode = connection.getResponseCode();

         if(responseCode >= 400)
         {
             System.out.println("Broken link: " + url + " with response code: " + responseCode);
         }

     }
        driver.quit();

     }


    }

