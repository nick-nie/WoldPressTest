package webdriver.creator.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import util.BrowserProfile;
import webdriver.creator.WebDriverCreator;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class IEDriverCreator implements WebDriverCreator {
    public WebDriver createWebDriver(BrowserProfile profile) {
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
}
