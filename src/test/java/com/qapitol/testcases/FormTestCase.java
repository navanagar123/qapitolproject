package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.FormsPage;
import com.qapitol.pages.TextBoxPage;
import com.qapitol.util.ExcelData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class FormTestCase extends BaseClass {


    @Test(dataProvider="testData")
    public void formsPage(String fname,String lname,String email) throws InterruptedException {
        FormsPage fp=new FormsPage();
        fp.formsElemnets(fname,lname,email);
    }

    @DataProvider(name="testData")
    public Object[][] testDataFeed() throws IOException {

//        Object[][] data =new Object[2][3];
//        data[0][0]="amruta";
//        data[0][1]="bhat";
//        data[0][2]="abc@gmail.com";
//
//
//        data[1][0]="abc";
//        data[1][1]="xyz";
//        data[1][2]="abc@gmail.com";
        Object[][] data = ExcelData.getData();
        return data;
        //return new Object[][]{{"amruta","bhat","abc@gmail.com"},{"abc","xyz","abc@gmail.com"}};
    }
}
