package page;

import base.PageObject;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class LoginPage {
    public final static String Username = "userName";
    public final static String Password = "password";
    public final static String LoginButton = "login";

    @FindBy (name = LoginPage.Username)
    private WebElement username;

    @FindBy (name = LoginPage.Password)
    private WebElement password;

    @FindBy (name = LoginPage.LoginButton)
    private WebElement loginbutton;

    public void sendKeyToUsername(String name){
        username.clear();
        username.sendKeys(name);
    }

    public void sendKeyToPassword(String pass){
        password.clear();
        password.sendKeys(pass);
    }

    public void clickOnLoginButton(){
        loginbutton.submit();
    }

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
