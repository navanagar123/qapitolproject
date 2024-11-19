package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DatePickerPage extends BaseClass {
    public DatePickerPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[5]")
    WebElement mainClk;

    @FindBy(xpath = "(//li[@id='item-8'])[2]")
    WebElement menuele;

    @FindBy(id="cars")
    WebElement multiele;

    @FindBy(id="oldSelectMenu")
    WebElement slctmenu;

    @FindBy(id="datePickerMonthYearInput")
    WebElement dateslect;

    @FindBy(css=".react-datepicker__month-select")
    WebElement months;
    @FindBy(css=".react-datepicker__year-select")
    WebElement years;

    @FindBy(css=" .react-datepicker__day")
   List<WebElement>  days;

    @FindBy(xpath = "(//li[@id='item-2'])[3]")
    WebElement dateele;

    @FindBy(xpath = "(//li[@id='item-3'])[3]")
    WebElement slideclk;

    @FindBy(css = ".range-slider__tooltip")
    WebElement slidebar;

    @FindBy(xpath = "(//li[@id='item-4'])[3]")
    WebElement prgressbar;

    @FindBy(id="startStopButton")
    WebElement startbtn;

    @FindBy(id=" toolTipButton")
    WebElement hoverbbtn;

    @FindBy(css="tooltip-inner")
    WebElement tooltip;

    @FindBy(xpath = "(//li[@id='item-6'])[2]")
    WebElement tooltipclk;








    public void datepickerElements() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()", dateele);


        String year = "2024";
        String month = "September";
        String dateMonth = "1";


        dateslect.click();
        Select s = new Select(months);
        s.selectByVisibleText(month);
        Select s1 = new Select(years);
        s1.selectByValue(year);




        for (WebElement dayslct : days) {


            if (dayslct.getText().equalsIgnoreCase(dateMonth)) {

                dayslct.click();
            }


        }


    }

    public void selectMenuElements() {
        //    WebElement mainClk = driver.findElement(By.xpath(""));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()", menuele);

        WebElement datapickerclk = driver.findElement(By.xpath("(//li[@id='item-8'])[2]"));
        js.executeScript("arguments[0].click()", datapickerclk);

        Select s=new Select(multiele);
        s.selectByIndex(0);
        s.selectByValue("audi");

        Select s1=new Select(slctmenu);
        s1.selectByVisibleText("Yellow");

    }


    public void slider(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()", slideclk);


        Actions a=new Actions(driver);
        a.clickAndHold(slidebar).moveByOffset(100, 0).release().perform();




    }

    public void progressBar(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()", prgressbar);

        int totalsteps=2;

      for(int i=0;i<totalsteps;i++){
          startbtn.click();
      }





    }

    public void tooltip(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", mainClk);
        js.executeScript("arguments[0].click()",tooltipclk);

        Actions a=new Actions(driver);
        a.moveToElement(hoverbbtn);
        System.out.println(tooltip.getText());


    }


}
