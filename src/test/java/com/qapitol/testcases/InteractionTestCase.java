package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.InteractionsPage;
import org.testng.annotations.Test;

public class InteractionTestCase extends BaseClass {

    @Test()
    public void interactionHandling(){
        InteractionsPage ip=new InteractionsPage();
        ip.sortable();
    }

    @Test
    public void dropping(){
        InteractionsPage ip=new InteractionsPage();
       ip.darggble();
    }




}
