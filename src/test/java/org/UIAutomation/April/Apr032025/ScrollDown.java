package org.UIAutomation.April.Apr032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ScrollDown {

    public static void main(String[] args) throws AWTException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.manage().window().maximize();

        Robot robot = new Robot();

        for(int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.delay(2000);
        }

//        robot.mouseWheel(10);
//        robot.delay(2000);

        driver.quit();
    }
}
