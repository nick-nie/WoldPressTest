import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class TempTest {

    public WebDriver driver;
    public final static String LOGIN_URL = "http://demosite.center/wordpress/wp-login.php";
    public final static String USERNAME = "admin";
    public final static String PASSWORD = "demo123";

    @Test
    public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(LOGIN_URL);
        WebElement username = driver.findElement(By.id("user_login"));
        username.sendKeys(USERNAME);
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys(PASSWORD);
        WebElement loginButton = driver.findElement(By.id("wp-submit"));
        loginButton.submit();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
