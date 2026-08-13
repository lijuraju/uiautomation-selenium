package org.UIAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactory {



    WebDriver driver;

    //Locators
    @FindBy ( xpath ="//input[@placeholder='E-Mail Address']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@class='btn btn-primary']" )
    WebElement loginButton ;


    //Constructor
    public LoginPagePageFactory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPagePageFactory() {
    }


    //Actions
    public void enterEmail(String emailAddress)
    {
      email.sendKeys(emailAddress);
    }

    public  void enterPassword(String passwordValue)
    {
        password.sendKeys(passwordValue);
    }

    public void clickLoginButton()
    {
       loginButton.sendKeys(Keys.ENTER);
    }

}
