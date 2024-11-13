package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BaseClass {

    public void alertElements() throws InterruptedException {
        WebElement alertmain = driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[3]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",alertmain );


        WebElement actionclk = driver.findElement(By.xpath("(//li[@id='item-1'])[2]"));
        js.executeScript("arguments[0].click()",actionclk);

        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();

        Thread.sleep(1000);
        WebElement confm = driver.findElement(By.id("confirmButton"));
        js.executeScript("arguments[0].click()",confm);
        driver.switchTo().alert().dismiss();






    }
}
