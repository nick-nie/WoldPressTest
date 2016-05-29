package webdriver.creator.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.BrowserProfile;
import webdriver.creator.WebDriverCreator;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class FirefoxDriverCreator implements WebDriverCreator {
    public WebDriver createWebDriver(BrowserProfile profile) {
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
