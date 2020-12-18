package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(){
//        System.setProperty("webdriver.chromedriver", "webdriver/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("http://www.webdriveruniversity.com/index.html");

        driver=Driver.getDriver();
        String homePageUrl = "http://www.webdriveruniversity.com/index.html";
        driver.get(homePageUrl);
    }

    public void controltitle(){
        WebElement nav_title = driver.findElement(By.xpath("//a[@id='nav-title']"));
        nav_title.isDisplayed();
        System.out.println("Title is Displayed");
    }

    public void clickButtonLink(){
        WebElement buttonLink = driver.findElement(By.xpath("//a[@id='button-clicks']"));
        buttonLink.click();

    }


}
