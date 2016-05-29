package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public enum BrowserProfile {

    XXS(new Dimension(320,568)),
    XS(new Dimension(480,800)),
    SM(new Dimension(640,960)),
    MD(new Dimension(1024,768)),
    LG;

    private Dimension dimension;

    BrowserProfile(Dimension dimension) {
        this.dimension = dimension;
    }

    BrowserProfile() {

    }

    public void setWindowSize(WebDriver driver)
    {
        if (dimension == null)
        {
            driver.manage().window().maximize();
        } else
        {
            int scrollBarWidth = getScrollBarWidth(driver);
            driver.manage().window().setSize(new Dimension(dimension.width + scrollBarWidth, dimension.height));
        }
    }

    /**
     * Check if the profile is one of the listed ones.
     * @param profiles a list of profiles (as arguments)
     * @return true if profile is one of the listed profiles
     */
    public boolean isAnyOf(BrowserProfile... profiles)
    {
        boolean retVal = false;
        for (final BrowserProfile profile : profiles)
        {
            retVal = retVal || (this == profile);
        }
        return retVal;
    }

    private int getScrollBarWidth(WebDriver driver)
    {
        Long value = (Long) ((JavascriptExecutor) driver).executeScript(JavaScriptConstants.JS_GET_SCROLLBAR_WIDTH);
        return Integer.parseInt(value.toString());
    }
}
