package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.*;
import com.qapitol.util.ExcelData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.datatransfer.Clipboard;
import java.io.IOException;

public class Textboxtestcase extends BaseClass {

    @Test()
    public void textBox(){
        TextBoxPage t=new TextBoxPage();
        t.TextboxElemnets();
    }

    @Test()
    public void checkBox() throws InterruptedException {
        TextBoxPage ch=new TextBoxPage();
        ch.checkboxElements();

    }

    @Test()
    public void webTable() throws InterruptedException {
        TextBoxPage ch=new TextBoxPage();
        ch.webTable();

    }





}
