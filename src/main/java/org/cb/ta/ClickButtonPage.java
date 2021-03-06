package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickButtonPage {
    WebDriver driver;
    WebElement webclickbutton;
    WebElement conguralationstitle;
    WebElement maintitle;
    WebElement jsclickbutton;
    WebElement closebutton;
    WebElement clsbutton;

    public ClickButtonPage() {
        driver=Driver.getDriver();
        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
        webelementdefinition();
    }
    //@FindBy(xpath ="//div[@id='main-header']")
    // public WebElement maintitle;

    public void webelementdefinition(){
        maintitle=driver.findElement(By.xpath("//div[@id='main-header']"));
        webclickbutton=driver.findElement(By.xpath("//span[@id='button1']"));
        conguralationstitle=driver.findElement(By.xpath("//h4[@class='modal-title']"));
        jsclickbutton=driver.findElement(By.xpath("//span[@id='button2']"));
        closebutton=driver.findElement(By.xpath("//button[@class='close']"));
    }

    public void maintitlecontrol(){
        maintitle.isDisplayed();
        System.out.println(maintitle.getText());
        System.out.println("main title gorundu");
    }

    public boolean webelememntclickbuttoncontroll(){
        return webclickbutton.isDisplayed();
        //System.out.println("web element click button seemed");
    }

    public boolean javascriptclickbuttoncontroll(){
        return jsclickbutton.isDisplayed();
        //System.out.println("js click button seemed");
    }

    public void wbbuttonclick(){
        webclickbutton.click();
        conguralationstitle.isDisplayed();
    }

    public void clickclosewbpopup() throws InterruptedException {
        Thread.sleep(2000);
        closebutton.click();
    }

    public void jsbuttonclick(){
        jsclickbutton.click();
    }

    public void clsButtonPopup() throws InterruptedException {
//        clsbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        clsbutton=driver.findElement(By.xpath("//*[@id=\"myModalJSClick\"]/div/div/div[2]/button"));
        Thread.sleep(2000);
        clsbutton.click();
    }
}