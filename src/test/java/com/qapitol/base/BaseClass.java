package com.qapitol.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    @BeforeMethod
    public static void  initialize() throws IOException {
        Properties prop=new Properties();

       FileInputStream fis=new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\QapitolProject\\src\\test\\java\\com\\qapitol\\util\\TestData.properties");
        prop.load(fis);
        String urlName = prop.getProperty("url");
        driver = new ChromeDriver();
        driver.get(urlName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


    }

//    @AfterMethod
//    public void closingBrowser() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.close();
//    }



}
