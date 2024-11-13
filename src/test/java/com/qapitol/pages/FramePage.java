package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FramePage extends BaseClass {

    public void frameElements(){
        WebElement alertmain = driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[3]"));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",alertmain );
        WebElement actionclk = driver.findElement(By.xpath("(//li[@id='item-2'])[2]"));
        js.executeScript("arguments[0].click()",actionclk );

        driver.switchTo().frame("frame1");
        String txt = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(txt);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        String txt1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(txt1);
        driver.switchTo().defaultContent();

        WebElement nestedclk = driver.findElement(By.xpath("(//li[@id='item-3'])[2]"));
        js.executeScript("arguments[0].click()",nestedclk );

        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        WebElement childFrame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(childFrame.getText());

        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());




    }
}
