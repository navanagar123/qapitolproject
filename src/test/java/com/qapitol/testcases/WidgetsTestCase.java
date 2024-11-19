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

    @Test
    public void autoComplete(){
        DatePickerPage dt=new DatePickerPage();
        dt.autoCompleteElements();

    }





}
