package org.UIAutomation.August.Aug272025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {


        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://testautomationpractice.blogspot.com/");

        driver.executeScript("window.scrollBy(0,500)");

         List<WebElement> chkBoxes= driver.findElements(By.xpath("//label[text()='Days:']/ancestor::div[@class='form-group']/descendant::input[@type='checkbox']"));

         int count = chkBoxes.size();

         for(int i=0; i<count;i++)
         {
             if(chkBoxes.get(i).getAttribute("id").equals("sunday") || chkBoxes.get(i).getAttribute("id").equals("saturday") )
             {
                 chkBoxes.get(i).click();
             }

         }
         Thread.sleep(3000);

         driver.quit();
    }
}
