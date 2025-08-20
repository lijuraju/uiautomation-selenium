package org.UIAutomation.August.Aug162025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        int rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();

        System.out.println(rows);

        int cols = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();

        System.out.println(cols);


        for(int i=1; i<=1; i++)
        {

            for(int j=1; j<=cols;j++)
            {
                System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th["+j+"]")).getText());
                System.out.print("  ");
            }
            System.out.println();
        }

        for(int i=2; i<=rows; i++)
        {

            for(int j=1; j<=cols;j++)
            {
                System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText());
                System.out.print("  ");
            }
            System.out.println();
        }


    }
}
