package org.UIAutomation.August.Aug162025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        driver.manage().window().maximize();

        WebElement link1 = driver.findElement(By.xpath("//a[@href='http://www.google.com']"));
        WebElement link2 = driver.findElement(By.xpath("//a[@href='http://www.facebook.com']"));
        WebElement link3 = driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']"));

        link1.click();

        link2.click();
        link3.click();

        String pHandle = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();

        List<String> listHandles =  new ArrayList<>(handles);


            driver.switchTo().window(listHandles.get(2));
            System.out.println("I am in Yahoo");
            System.out.println(driver.getTitle());



        driver.quit();





    }
}
