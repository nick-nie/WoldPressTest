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
public class LoginTest extends TestCase{

    public LoginPage loginPage;
    public final static String USERNAME = "admin";
    public final static String PASSWORD = "demo123";

    @Test
    public void testScenario(){
        //loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage = new LoginPage(driver);
        loginPage.sendKeyToUsername(USERNAME);
        loginPage.sendKeyToPassword(PASSWORD);
        loginPage.setRememberMeCheckBox();
        loginPage.clickOnLoginButton();
    }
}
