package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Driver {
    public static WebDriver getDriver(){
        /**
         * chrome, firefox, safari, ie, opera
         */
        String browserType = "chrome";
        switch(browserType) {
            case "chrome":
                System.setProperty("webdriver.chromedriver", "webdriver/chromedriver");
                 return new ChromeDriver();
             case "firefox":
                System.setProperty("webdriver.chromedriver", "webdriver/geckodriver");
                 return new ChromeDriver();
             case "safari":
                System.setProperty("webdriver.chromedriver", "webdriver/safaridriver");
                 return new ChromeDriver();
        }
        return null;
    }

}
