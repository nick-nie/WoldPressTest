package webdriver.creator;

import org.openqa.selenium.WebDriver;
import util.BrowserProfile;
import util.TestContext;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public interface WebDriverCreator {

    public WebDriver createWebDriver(BrowserProfile profile);
}
