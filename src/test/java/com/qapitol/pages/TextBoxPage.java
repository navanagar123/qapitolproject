package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseClass {
    public TextBoxPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[1]")
    WebElement elementMain;

    @FindBy(xpath ="(//li[@id='item-0'])[1]")
    WebElement textBox;

       @FindBy(id="userName")
       WebElement useName;

       @FindBy(id="userEmail")
       WebElement userEmail;

       @FindBy(id="permanentAddress")
       WebElement address;

    @FindBy(id="currentAddress")
    WebElement caddress;

    @FindBy(xpath="//button[text()='Submit']")
    WebElement submit;

    @FindBy(xpath="(//li[@id='item-3'])[1]")
    WebElement webtableClk;

    @FindBy(id="addNewRecordButton")
    WebElement addBtn;

    @FindBy(id="firstName")
    WebElement name;

    @FindBy(xpath ="(//li[@id='item-1'])[1]")
    WebElement checkBox;

    @FindBy(xpath="//button[@title='Expand all']")
    WebElement expand;

    @FindBy(xpath="//button[@title='Collapse all']")
    WebElement collapse;

    @FindBy(xpath="//button[@title='Toggle']")
    WebElement toggle;
























    public void TextboxElemnets(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",elementMain);
        js.executeScript("arguments[0].click()",textBox);
        useName.sendKeys("abc");
        userEmail.sendKeys("abc@gmail.com");
        caddress.sendKeys("bangalore");
        address.sendKeys("bangalore");
        js.executeScript("arguments[0].click()",submit);




 }
    public void webTable() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",elementMain);
        js.executeScript("arguments[0].click()",webtableClk);

        js.executeScript("arguments[0].click()",addBtn);

        name.sendKeys("Amruta");

    }
    public void checkboxElements() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",elementMain);
        js.executeScript("arguments[0].click()",checkBox);


        js.executeScript("arguments[0].click()",expand);
        js.executeScript("arguments[0].click()",collapse);
        js.executeScript("arguments[0].click()",toggle);



    }
}

