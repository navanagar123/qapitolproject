package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends BaseClass {
    public FormsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[2]")
    WebElement formMain;

    @FindBy(xpath ="(//li[@id='item-0'])[2]")
    WebElement practiceForm;

    @FindBy(id ="firstName")
    WebElement firstName;

    @FindBy(id ="lastName")
    WebElement lastName;









    public void formsElemnets(String fname, String lname,String email) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", formMain);
        js.executeScript("arguments[0].click()", practiceForm);
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        //System.out.println(email);


    }


}
