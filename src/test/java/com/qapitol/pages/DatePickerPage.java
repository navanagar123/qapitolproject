package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DatePickerPage extends BaseClass {

  public void datepickerElements(){
      WebElement mainClk = driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[4]"));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click()",mainClk);

      WebElement datapickerclk = driver.findElement(By.xpath("(//li[@id='item-2'])[3]"));
      js.executeScript("arguments[0].click()",datapickerclk );


      String year="2024";
      String month="September";
      String dateMonth="1";



      driver.findElement(By.id("datePickerMonthYearInput")).click();
      Select s=new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
     s.selectByVisibleText(month);
     Select s1=new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
     s1.selectByValue(year);

      List<WebElement> days = driver.findElements(By.cssSelector(".react-datepicker__day"));


      for(WebElement dayslct:days){


          if(dayslct.getText().equalsIgnoreCase(dateMonth)){

              dayslct.click();
          }




      }



  }

  public void autoCompleteElements(){
      WebElement mainClk = driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='avatar mx-auto white'])[4]"));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click()",mainClk);

      WebElement datapickerclk = driver.findElement(By.xpath("(//li[@id='item-1'])[3]"));
      js.executeScript("arguments[0].click()",datapickerclk );




      WebElement autoclk = driver.findElement(By.id("autoCompleteMultiple"));

      js.executeScript("arguments[0].scrollIntoView(true)",autoclk);
      js.executeScript("arguments[0].setAttribute('value','blue')",autoclk);




  }
}
