package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;

public class FormsPage extends BaseClass {
    public void formsElemnets(String fname,String lname,String email) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span/div/div[1]")).click();

        Thread.sleep(1000);
      driver.findElement(By.xpath("//span[text()='Practice Form']")).click();

driver.findElement(By.id("firstName")).sendKeys(fname);
driver.findElement(By.id("lastName")).sendKeys(lname);
driver.findElement(By.id("userEmail")).sendKeys(email);

    }


}
