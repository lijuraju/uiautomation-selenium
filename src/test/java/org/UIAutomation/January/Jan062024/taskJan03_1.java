package org.UIAutomation.January.Jan062024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class taskJan03_1 {

    @Test
    public void createAccount() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");
        Thread.sleep(3000);

        WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);

        WebElement btnCreateAccount = driver.findElement(By.xpath("//span[normalize-space()='Create Account']"));
        btnCreateAccount.click();
        Thread.sleep(1000);

        WebElement txtName = driver.findElement(By.xpath("//input[@data-name='name']"));
        txtName.sendKeys("John Doe");


        WebElement drpdwnCity = driver.findElement(By.xpath("//input[@data-name='billingAddressCity']"));
        drpdwnCity.sendKeys("Paris");
        Thread.sleep(3000);



        WebElement drpdwnType = driver.findElement(By.xpath("//div[@class='selectize-input items has-options full has-items']"));
        drpdwnType.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Investor'",drpdwnType);
        Thread.sleep(1000);



        List<WebElement> names = driver.findElements(By.xpath("//tbody/tr[1]/td[2]"));
        String fname ="";

        for(WebElement name:names){

            fname = name.getText();
            if (fname.equals("John Doe"))
                break;

        }

        Assert.assertEquals(fname,"John Doe");

        driver.quit();

    }
}
