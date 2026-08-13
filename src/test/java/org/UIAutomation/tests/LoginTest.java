package org.UIAutomation.tests;

import org.UIAutomation.Pages.LoginPage;
import org.UIAutomation.Pages.LoginPagePageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends LoginPagePageFactory {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("test@gmail.com");
        loginPage.enterPassword("abcd");
        loginPage.clickLoginButton();
        driver.wait(1000);
        driver.quit();
    }
}
