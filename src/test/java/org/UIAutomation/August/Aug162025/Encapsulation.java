package org.UIAutomation.August.Aug162025;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Encapsulation {

    @FindBy(name = "username")
    private WebElement txtUsername;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement btnLogin;

    public void clickLogin(String username,String password) {
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();

    }



}
