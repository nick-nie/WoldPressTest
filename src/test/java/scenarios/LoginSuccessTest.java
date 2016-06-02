package scenarios;

import base.PageObject;
import base.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.LoginPage;

import java.awt.*;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class LoginSuccessTest extends TestCase{

    public LoginPage loginPage;
    public final static String USERNAME = "tiger.mi@abc.com";
    public final static String PASSWORD = "123456";

    @Test
    public void loginMercuryToursWithCorrectCredential(){
        loginPage = new LoginPage(driver);
        loginPage.sendKeyToUsername(USERNAME);
        loginPage.sendKeyToPassword(PASSWORD);
        loginPage.clickOnLoginButton();
    }
}
