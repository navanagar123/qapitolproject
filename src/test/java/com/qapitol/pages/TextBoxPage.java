package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BaseClass {

 public void TextboxElemnets(){
     driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
    driver.findElement(By.id("item-0")).click();
    driver.findElement(By.id("userName")).sendKeys("abc");
    driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("currentAddress")).sendKeys("bangalore");
    driver.findElement(By.id("permanentAddress")).sendKeys("bangalore");
   WebElement element= driver.findElement(By.xpath("//button[text()='Submit']"));
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript("arguments[0].click()",element);




 }

}

