package org.UIAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    WebDriver driver;

    //Locators
    By email = By.xpath("//input[@placeholder='E-Mail Address']");
    By password =  By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//input[@class='btn btn-primary']");

   //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    // This constructor is required to initialize the WebDriver instance for this page object.
    // It follows the Page Object Model (POM) design pattern where the driver is passed from the test class
    // to enable interaction with web elements defined in this page class.
    // Without this constructor, the driver would be null and any attempt to find elements would throw a NullPointerException.


    public LoginPage() {
    }
    public void enterEmail(String emailAddress)
    {
        driver.findElement(email).sendKeys(emailAddress);
    }

    public  void enterPassword(String passwordValue)
    {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLoginButton()
    {
        driver.findElement(loginButton).sendKeys(Keys.ENTER);
    }


}
