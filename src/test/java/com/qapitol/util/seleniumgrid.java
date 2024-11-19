package com.qapitol.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;

public class seleniumgrid {
    String huburl="http://192.168.2.65";
    @Test
    public void gridTest(){
        try{
            System.out.println("Grid testing has been started");
            DesiredCapabilities capability=new DesiredCapabilities();
            capability.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(huburl),capability);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://www.selenium.dev/");
            Thread.sleep(10000);
            String title=driver.getTitle();
            System.out.println(title);
            System.out.println("Grid testing has been ended");
            driver.quit();     } catch (Exception e) {
            System.out.println("the exception is=" +e);     }
    }
    @Test(priority = 1)
    public void gridTest1(){
        try{
            System.out.println("Grid testing has been started");
            DesiredCapabilities capability=new DesiredCapabilities();
            capability.setBrowserName("chrome");
            WebDriver driver=new RemoteWebDriver(new URL(huburl),capability);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://www.selenium.dev/");
            Thread.sleep(10000);
            String title=driver.getTitle();
            System.out.println(title);
            System.out.println("Grid testing has been ended");
            driver.quit();        }

         catch (Exception e) {
             System.out.println("the exception is=" +e);
        }
    }



}
