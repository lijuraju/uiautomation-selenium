package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.SessionId;

public class MultipleKeys {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        SessionId sessionId =  ((ChromeDriver) driver).getSessionId();
        System.out.println("Session ID: " + sessionId);
        System.out.println("Session ID: " + sessionId.toString());

        WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        Actions a = new Actions(driver);

        a.keyDown(Keys.CONTROL)
                .keyDown(Keys.SHIFT)
                .keyDown(Keys.ALT)
                .sendKeys(searchbox,"liju hahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")
                .keyUp(Keys.ALT)
                .keyUp(Keys.SHIFT)
                .keyUp(Keys.CONTROL)
                .build()
                .perform();



        Thread.sleep(8000);

        driver.quit();


                   }


}
