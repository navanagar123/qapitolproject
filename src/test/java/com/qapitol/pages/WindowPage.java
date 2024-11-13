package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class WindowPage extends BaseClass {
    public void windowElements(){

        WebElement mainClk = driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[3]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",mainClk);

        WebElement actionclk = driver.findElement(By.xpath("(//li[@id='item-0'])[3]"));
        js.executeScript("arguments[0].click()",actionclk );

        driver.findElement(By.id("tabButton")).click();
        String parentwindow = driver.getWindowHandle();
        Set<String> w = driver.getWindowHandles();

      for(String win:w){
          if(!win.equals(parentwindow)){
              driver.switchTo().window(win);
              System.out.println(driver.getCurrentUrl());

          }
      }
   driver.switchTo().window(parentwindow);
      driver.findElement(By.id("windowButton")).click();
        String patentwindows = driver.getWindowHandle();
        Set<String> newWindow = driver.getWindowHandles();

        for(String win:newWindow){
            if(!win.equals(patentwindows)){
                driver.switchTo().window(win);
                System.out.println(driver.findElement(By.id("sampleHeading")).getText());

            }
        }




    }



}
