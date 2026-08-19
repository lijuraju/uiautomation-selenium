package org.UIAutomation.August.Aug182026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calender {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));

        String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        String currentDate = driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).getText();

          int date = Integer.parseInt(currentDate);
          int newDate = date +30;

//        while( !(currentMonth.equals("November")&&currentYear.equals("2026")))
//        {
//            driver.findElement(By.xpath("//span[text()='Next']")).click();
//             currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//             currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//
//        }

        if(newDate>31)
        {
            driver.findElement(By.xpath("//span[text()='Next']")).click();
            newDate = newDate - 31;
            driver.findElement(By.xpath("//a[text()='"+ newDate +"']")).click();
        }
        //driver.findElement(By.xpath("//a[text()='10']")).click();
        //driver.findElement(By.xpath("//a[text()='"+ newDate +"']")).click();
        driver.wait(1000);



        driver.quit();
    }
}
