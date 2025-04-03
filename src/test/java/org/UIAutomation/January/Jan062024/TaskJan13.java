package org.UIAutomation.January.Jan062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TaskJan13 {

    @Test
    public void taskJan13() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://btc5x344.code1.emi.philips.com/practicenextgen/bi/site/philips-master/dashboard-designer/cda1878b-252a-4b5b-872f-4666bd7394e9/draft/l9");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='usernameUserInput']")).sendKeys("xiuser ");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("radiology");
        driver.findElement(By.xpath("//button[@role='button']")).click();

        //driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
        Thread.sleep(12000);
        Thread.sleep(10000);

        //driver.findElement(By.xpath("//input[@id='dashboardDesigner_panelSearch']")).sendKeys("Column");
        //Thread.sleep(3000);

//        driver.findElement(By.xpath("//div[@id='nav-all']//p[@class='text-center text-wrap text-break'][normalize-space()='Practice']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[@class='menu-icon-container create-menu-icon']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//li[@class='create-dashboard-scratch']//img[@id='templates-img']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//input[@id='save-draft-input']")).sendKeys("L10");
//
//        driver.findElement(By.xpath("//button[normalize-space()='Add and Design']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement coloumn = driver.findElement(By.xpath("//div[@class='e-draggable bbi-dbrd-designer-widget-group-column e-js e-tooltip' and @data-widgetname='Column']"));
        //coloumn.click();

        WebElement destination = driver.findElement(By.xpath("//div[@id='dashboardDesigner_designCanvas']"));
        //destination.click();

        Actions actions = new Actions(driver);

        actions.dragAndDrop(coloumn, destination).build().perform();

        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        Thread.sleep(10000);

        driver.quit();



    }
}
