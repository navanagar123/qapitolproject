package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.*;
import com.qapitol.util.ExcelData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.datatransfer.Clipboard;
import java.io.IOException;

public class Textboxtestcase extends BaseClass {

    @Test(enabled = false)
    public void textBox(){
        TextBoxPage t=new TextBoxPage();
        t.TextboxElemnets();
    }

    @Test(enabled = false)
    public void checkBox() throws InterruptedException {
        CheckboxPage ch=new CheckboxPage();
        ch.checkboxElements();

    }
    @Test(enabled = false)
    public void webTable() throws InterruptedException {
        WebTablesPage wt=new WebTablesPage();
        wt.webTable();
        


    }

    @Test(dataProvider="testData",enabled=false)
    public void formsPage(String fname,String lname) throws InterruptedException {
        FormsPage fp=new FormsPage();
        fp.formsElemnets(fname,lname);
    }

//    @DataProvider(name="testData")
//    public Object[][] testDataFeed() throws IOException {
//
//        Object[][] data = ExcelData.getDta();
//
//        return data;
//
//    }




}
