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
import java.util.Set;

public class BrokenLinks {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {


        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for(WebElement link : links)
        {
          String url =  link.getAttribute("href"); //here, we are getting the urls

          URL correctURL = new URL(url);

            HttpURLConnection connection = (HttpURLConnection) correctURL.openConnection();

            int res = connection.getResponseCode();

            if (res == 200)
            {
                System.out.println("Valid link  "+ url +" response code "+ res);
            }
            else
                System.out.println("Broken link  "+ url + " response code "+ res );


            }
driver.quit();
        }


    }

