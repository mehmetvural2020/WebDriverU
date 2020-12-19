package org.cb.ta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickButtonPageTest {
    ClickButtonPage clickbuttonsPage=new ClickButtonPage();

    @Test
    public void maintitletest(){

        clickbuttonsPage.maintitlecontrol();
    }
    @Test
    public void webelementclickbuttoncontrol(){

        Assert.assertEquals(true,clickbuttonsPage.webelememntclickbuttoncontroll());
    }
    @Test
    public void jsclickbuttoncontrol(){

        Assert.assertTrue(clickbuttonsPage.javascriptclickbuttoncontroll());
    }
    @Test
    public void clickwbbutton(){
        clickbuttonsPage.wbbuttonclick();
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
