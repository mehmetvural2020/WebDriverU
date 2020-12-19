package org.cb.ta;

import org.testng.annotations.Test;

public class HomePageTest {
    HomePage homePage = new HomePage();

    @Test
    public void navTitleIdDisplayed(){
        homePage.controltitle();
    }

    @Test
    public void clickButtonLink(){
        homePage.clickButtonLink();
    }

}
