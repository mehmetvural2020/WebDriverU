package org.cb.ta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickButtonsPageTest {
//    Onur beyin guncellemelerinden

    ClickButtonsPage clickbuttonsPage=new ClickButtonsPage();

    @Test
    public void maintitletest(){
        clickbuttonsPage.maintitlecontrol();
    }

    @Test
    public void webelementclickbuttoncontrol(){
        Assert.assertTrue(clickbuttonsPage.webelememntclickbuttoncontroll());
    }

    @Test
    public void jsclickbuttoncontrol(){
        clickbuttonsPage.javascriptclickbuttoncontroll();
    }

    @Test
    public void clickwbbutton(){
        Assert.assertTrue(clickbuttonsPage.wbbuttonclick());
    }

    @Test
    public void closewbpopup() throws InterruptedException {
        clickbuttonsPage.clickclosewbpopup();
    }

    @Test
    public void jsbuttonclick(){
        clickbuttonsPage.jsbuttonclick();
    }

}
