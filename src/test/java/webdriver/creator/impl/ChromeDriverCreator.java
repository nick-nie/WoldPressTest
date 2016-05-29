package webdriver.creator.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import util.BrowserProfile;
import util.TestContext;
import webdriver.creator.WebDriverCreator;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class ChromeDriverCreator implements WebDriverCreator {
    public WebDriver createWebDriver(BrowserProfile profile) {
        System.setProperty("webdriver.chrome.driver", TestContext.getInstance().getChromeDriver());
        final ChromeOptions chromeOptions = createBasicOptions();

        final WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to(TestContext.getInstance().getBaseUrl());
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.MINUTES);
        profile.setWindowSize(driver);
        return driver;
    }

    private ChromeOptions createBasicOptions()
    {
        final ChromeOptions options = new ChromeOptions();
        return options;
    }
}
