package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.CheckboxPage;
import com.qapitol.pages.FormsPage;
import com.qapitol.pages.TextBoxPage;
import com.qapitol.pages.WebTablesPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

    @Test(dataProvider="testData")
    public void formsPage(String fname,String lname,String email) throws InterruptedException {
        FormsPage fp=new FormsPage();
        fp.formsElemnets(fname,lname,email);
    }

    @DataProvider(name="testData")
    public Object[][] testDataFeed(){
        Object[][] data = new Object[1][3];
        data[0][0]="Amruta";
        data[0][1]="Bhat";
        data[0][2]="abc@gmail.com";
        return data;

    }

}
