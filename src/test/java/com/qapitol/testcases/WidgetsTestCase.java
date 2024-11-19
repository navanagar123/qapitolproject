package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.DatePickerPage;
import org.testng.annotations.Test;

public class WidgetsTestCase extends BaseClass {

    @Test(enabled = false)
    public void datePicker(){
        DatePickerPage dt=new DatePickerPage();
        dt.datepickerElements();


    }



    @Test(enabled = false)
    public void SelectMenu(){
        DatePickerPage sp=new DatePickerPage();
        sp.selectMenuElements();
    }

    @Test(enabled = false)
    public void slidebar(){
        DatePickerPage sb=new DatePickerPage();
        sb.slider();
    }

    @Test(enabled = false)
    public void progressBar(){
        DatePickerPage sb=new DatePickerPage();
        sb.progressBar();
    }

    @Test
    public void toolTip(){
        DatePickerPage sb=new DatePickerPage();
        sb.tooltip();
    }





}
