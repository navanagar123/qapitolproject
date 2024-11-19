package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class InteractionsPage extends BaseClass {

    public InteractionsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[4]")
    WebElement mainClk;

    @FindBy(xpath = "(//li[@id='item-0'])[5]")
    WebElement sortclk;

    @FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Two']")
    WebElement elemenet1;

    @FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Four']")
    WebElement elemenet2;

    @FindBy(xpath="(//li[@id='item-3'])[4]")
    WebElement dropClk;




    @FindBy(id="draggable")
    WebElement srcele;

    @FindBy(id="droppable")
    WebElement deltele;





    public void sortable(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()", sortclk);
        Actions a=new Actions(driver);

        a.dragAndDrop(elemenet2,elemenet1).perform();


    }
    public void darggble(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()", dropClk);
        Actions a=new Actions(driver);

        a.dragAndDrop(srcele,deltele).perform();


    }

}
