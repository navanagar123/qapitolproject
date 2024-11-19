package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckboxPage extends BaseClass {

    public void checkboxElements() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("item-1")).click();
        Thread.sleep(1000);
        WebElement element= driver.findElement(By.xpath("//button[@title='Expand all']"));
        WebElement element1=driver.findElement(By.xpath("//button[@title='Collapse all']"));
        WebElement element2=driver.findElement(By.xpath("//button[@title='Toggle']"));
       // WebElement element3= driver.findElement(By.xpath("//input[@id='tree-node-documents']//.."));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",element);
        js.executeScript("arguments[0].click()",element1);
        js.executeScript("arguments[0].click()",element2);
       // js.executeScript("arguments[0].click()",element3);


    }



}
