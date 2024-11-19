package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.AlertPage;
import com.qapitol.pages.FramePage;
import com.qapitol.pages.WindowPage;
import org.testng.annotations.Test;

public class AlertTextCase extends BaseClass {
    @Test(enabled = false)
    public void alerthandling() throws InterruptedException {
        AlertPage at=new AlertPage();
        at.alertElements();

    }
    @Test(enabled = false)
    public void frameHandling(){
        FramePage fp=new FramePage();
        fp.frameElements();

    }

    @Test
    public void windowHandling(){
        WindowPage wp=new WindowPage();
        wp.windowElements();
    }

}
