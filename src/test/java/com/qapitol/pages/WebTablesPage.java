package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends BaseClass {
    public void webTable() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(1000);
        WebElement ele=driver.findElement(By.id("item-3"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",ele);
       WebElement ele1=driver.findElement(By.id("addNewRecordButton"));
        js.executeScript("arguments[0].click()",ele1);

        driver.findElement(By.id("firstName")).sendKeys("Amruta");

    }

}
