package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickButtonsPage  {
//    Onur beyin guncellemelerinden

    WebDriver driver;
    WebElement webclickbutton;
    WebElement conguralationstitle;
    WebElement maintitle;
    WebElement jsclickbutton;
    WebElement closebutton;
    WebElement clsbutton;

    public ClickButtonsPage() {
        driver=Driver.getDriver();
        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
        webelementdefinition();
    }

    public void webelementdefinition(){
        maintitle=driver.findElement(By.xpath("//div[@id='main-header']"));
        webclickbutton=driver.findElement(By.xpath("//span[@id='button1']"));
        conguralationstitle=driver.findElement(By.xpath("//h4[@class='modal-title']"));
        jsclickbutton=driver.findElement(By.xpath("//span[@id='button2']"));
        closebutton=driver.findElement(By.xpath("//button[@class='close']"));
        clsbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
    }

    public void maintitlecontrol(){
        maintitle.isDisplayed();
        System.out.println(maintitle.getText());
        System.out.println("main title gorundu");
    }

    public boolean webelememntclickbuttoncontroll(){
        return webclickbutton.isDisplayed();
    }

    public void javascriptclickbuttoncontroll(){
        jsclickbutton.isDisplayed();
        System.out.println("js click button seemed");
    }

    public boolean wbbuttonclick(){
        boolean isDisplayed = webelememntclickbuttoncontroll();
        if (isDisplayed) {
            webclickbutton.click();
            return true;
        }
        return false;
    }

    public void clickclosewbpopup() throws InterruptedException {
        Thread.sleep(2000);
        closebutton.click();
    }

    public void jsbuttonclick(){
        jsclickbutton.click();
    }
}
