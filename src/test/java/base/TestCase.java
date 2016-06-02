package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import util.TestContext;
import webdriver.WebDriverFactory;
import webdriver.listener.ExtentReporterNG;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
@Listeners(ExtentReporterNG.class)
public class TestCase {
    protected WebDriver driver;
    public final static String BASEURL = "http://demosite.center/wordpress/wp-login.php";

    @BeforeTest
    public void setup(){
        driver = WebDriverFactory.create(TestContext.getInstance());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
