package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.AlertPage;
import org.testng.annotations.Test;

public class AlertTextCase extends BaseClass {
    @Test()
    public void alerthandling() throws InterruptedException {
        AlertPage at=new AlertPage();
        at.alertElements();

    }
    @Test()
    public void frameHandling(){
        AlertPage fp=new AlertPage();
        fp.frameElements();

    }

    @Test()
    public void windowHandling(){
        AlertPage wp=new AlertPage();
        wp.windowElements();

    }

}
