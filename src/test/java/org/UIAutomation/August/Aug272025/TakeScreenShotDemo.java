package org.UIAutomation.August.Aug272025;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotDemo {

    public static void main(String[] args) throws IOException {

        RemoteWebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

// The destination file path is incorrect - it specifies a directory path without a filename
// The file path should include the actual screenshot filename with extension (e.g. .png)
// Also recommended to use File.separator instead of hardcoded forward slashes for cross-platform compatibility
driver.get("https://testautomationpractice.blogspot.com/");

        File src = driver.getScreenshotAs(OutputType.FILE);

        File dest = new File("C://Personal//uiautomation-selenium//src//test//java//org//UIAutomation//August//Aug272025/abc.png");

        FileUtils.copyFile(src,dest);

        driver.quit();

    }
}
