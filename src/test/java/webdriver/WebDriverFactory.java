package webdriver;

import org.openqa.selenium.WebDriver;
import util.TestContext;
import webdriver.creator.WebDriverCreator;
import webdriver.creator.impl.ChromeDriverCreator;
import webdriver.creator.impl.FirefoxDriverCreator;
import webdriver.creator.impl.IEDriverCreator;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class WebDriverFactory {

    public static WebDriverCreator creator;
    public static WebDriver create(TestContext context){

        switch (context.getBrowserType()){
            case FIREFOX:
                creator = new FirefoxDriverCreator();
                break;
            case CHROME:
                creator = new ChromeDriverCreator();
                break;
            case IE:
                creator = new IEDriverCreator();
                break;
            default:
                break;
        }
        return creator.createWebDriver(context.getBrowserProfile());
    }
}
