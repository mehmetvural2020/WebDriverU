package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chromedriver", "webdriver/chromedriver");
        driver = new ChromeDriver();
        return driver;


    }
}
