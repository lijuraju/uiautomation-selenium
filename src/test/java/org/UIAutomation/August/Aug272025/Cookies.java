package org.UIAutomation.August.Aug272025;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Set;

public class Cookies {

    public static void main(String[] args) {

        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");

        Set<Cookie> ck1 = driver.manage().getCookies();

        System.out.println(ck1);

        Cookie c  = driver.manage().getCookieNamed("NID");

        System.out.println(c);
         Cookie c2 = new Cookie("Name","Liju");
        driver.manage().addCookie(c2);

        Set<Cookie> ck2 = driver.manage().getCookies();

        System.out.println(c.getName());
        System.out.println(c.getValue());

        driver.manage().deleteAllCookies();

        Set<Cookie> ck3 = driver.manage().getCookies();
        System.out.println(ck3.size());







    }
}
