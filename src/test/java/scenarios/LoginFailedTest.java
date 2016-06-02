package scenarios;

import base.TestCase;
import org.testng.annotations.Test;
import page.LoginPage;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class LoginFailedTest extends TestCase {

    public LoginPage loginPage;
    public final static String USERNAME = "tiger.mi@abc.com";
    public final static String PASSWORD = "1234567";

    @Test
    public void loginMercuryToursWithIncorrectCredential(){
        loginPage = new LoginPage(driver);
        loginPage.sendKeyToUsername(USERNAME);
        loginPage.sendKeyToPassword(PASSWORD);
        loginPage.clickOnLoginButton();
    }
}
