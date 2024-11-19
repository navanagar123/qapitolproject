package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class AlertPage extends BaseClass {
    public AlertPage(){

        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath ="(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[3]")
    WebElement alertmain;

    @FindBy(xpath ="(//li[@id='item-1'])[2]")
    WebElement alertclk;

    @FindBy(id ="alertButton")
    WebElement clkme1;

    @FindBy(id ="confirmButton")
    WebElement clkme2;


    @FindBy(xpath ="(//li[@id='item-0'])[3]")
    WebElement windowclk;

    @FindBy(id ="tabButton")
    WebElement newTab;

    @FindBy(id ="windowButton")
    WebElement newWindow;

    @FindBy(id ="sampleHeading")
    WebElement text;

    @FindBy(xpath =" (//li[@id='item-2'])[2]")
    WebElement frameclk;

    @FindBy(xpath =" (//li[@id='item-3'])[2]")
    WebElement nestedclk;

    @FindBy(xpath ="  //p[text()='Child Iframe']")
    WebElement childFrame;

    @FindBy(xpath = " //body[text()='Parent frame']")
    WebElement parentFrame;

    public void alertElements() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", alertmain);
        js.executeScript("arguments[0].click()", alertclk);

        clkme1.click();
        driver.switchTo().alert().accept();
        js.executeScript("arguments[0].click()", clkme2);
        driver.switchTo().alert().dismiss();


    }


    public void windowElements(){


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",alertmain);
        js.executeScript("arguments[0].click()",windowclk );

        newTab.click();
        String parentwindow = driver.getWindowHandle();
        Set<String> w = driver.getWindowHandles();

        for(String win:w){
            if(!win.equals(parentwindow)){
                driver.switchTo().window(win);
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }
        }
        driver.switchTo().window(parentwindow);
        newWindow.click();
        String patentwindows = driver.getWindowHandle();
        Set<String> newWindow = driver.getWindowHandles();

        for(String win:newWindow){
            if(!win.equals(patentwindows)){
                driver.switchTo().window(win);
                System.out.println(text.getText());
               //driver.close();
            }
        }
    }

    public void frameElements() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", alertmain);
        js.executeScript("arguments[0].click()", frameclk);

        driver.switchTo().frame("frame1");
        String txt = text.getText();
        System.out.println(txt);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        String txt1 = text.getText();
        System.out.println(txt1);
        driver.switchTo().defaultContent();
        js.executeScript("arguments[0].click()", nestedclk);

        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);

        System.out.println(childFrame.getText());

        driver.switchTo().parentFrame();
        System.out.println(parentFrame.getText());


    }

}
