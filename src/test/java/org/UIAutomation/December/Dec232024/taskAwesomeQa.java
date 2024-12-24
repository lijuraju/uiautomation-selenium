package org.UIAutomation.December.Dec232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class taskAwesomeQa {


    @Test
    public void createUser() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://awesomeqa.com/practice.html");

        driver.manage().window().maximize();


        WebElement fname = driver.findElement(By.name("firstname"));
        fname.sendKeys("John");

        WebElement lname = driver.findElement(By.name("lastname"));
        lname.sendKeys("Doe");


        WebElement male = driver.findElement(By.id("sex-1"));
        male.click();

        WebElement exp = driver.findElement(By.id("exp-1"));
        exp.click();


        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("24Dec2024");


        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();

        WebElement tools = driver.findElement(By.id("tool-2"));
        tools.click();


        Select se = new Select(driver.findElement(By.name("continents")));

        se.selectByValue("Australia");


        Thread.sleep(5000);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();


        driver.quit();














    }
}
