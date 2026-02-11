package org.UIAutomation.August.Aug272025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class CalculatePrice {

    public static void main(String[] args) {
        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://blinkit.com/");

        List<WebElement> priceList =
                driver.findElements(By.xpath("//div[text()='Candies & Gums']/ancestor::div[@type='77']/descendant::div[@class='Product__UpdatedPriceAndAtcContainer-sc-11dk8zk-10 ljxcbQ']/div/child::div[1]"));

        int sum = 0;
        for(WebElement p1 : priceList)
        {
            System.out.println(p1.getText());
            String priceText = p1.getText().replace("₹","").trim();
            sum  = sum + Integer.parseInt(priceText);

        }
        System.out.println(sum);
    }
}
