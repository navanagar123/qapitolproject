package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.CheckboxPage;
import com.qapitol.pages.TextBoxPage;
import com.qapitol.pages.WebTablesPage;
import org.openqa.selenium.By;
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
    @Test
    public void webTable() throws InterruptedException {
        WebTablesPage wt=new WebTablesPage();
        wt.webTable();
        


    }

}
