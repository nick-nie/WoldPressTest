package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Singleton class for storing test context properties.
 * @author Peter_Reperger
 */
public final class TestContext
{
    /**
     * Property file.
     */
    private static final String PROPERTIES_FILE = "project.properties";

    /**
     * TestContext instance.
     */
    private static TestContext instance;

    /**
     * Property: browser.type.
     */
    private BrowserType browserType;

    /**
     * Property: browser.profile.
     */
    private BrowserProfile browserProfile;

    /**
     * Property: base.url.
     */
    private String baseUrl;

    /**
     * Property: chrome.driver.
     */
    private String chromeDriver;

    /**
     * Property: ie.driver.
     */
    private String ieDriver;

    private TestContext()
    {
        try
        {
            initialize();
        } catch (IOException e)
        {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * Get TestContext instance.
     * @return {@link TestContext} instance
     */
    public static synchronized TestContext getInstance()
    {
        if (instance == null)
        {
            instance = new TestContext();
        }
        return instance;
    }

    /**
     * Get browser type.
     * @return browser type as {@link BrowserType}
     */
    public BrowserType getBrowserType()
    {
        return browserType;
    }

    /**
     * Get browser profile.
     * @return browser profile as {@link BrowserProfile}
     */
    public BrowserProfile getBrowserProfile()
    {
        return browserProfile;
    }

    /**
     * Get base URL.
     * @return base URL as {@link String}
     */
    public String getBaseUrl()
    {
        return baseUrl;
    }

    /**
     * Get the path to chrome driver.
     * @return path as {@link String}
     */
    public String getChromeDriver()
    {
        return chromeDriver;
    }

    /**
     * Get the path to IE driver.
     * @return path as {@link String}
     */
    public String getIEDriver()
    {
        return ieDriver;
    }

    private void initialize() throws IOException
    {
        final InputStream inputStream = ClassLoader.getSystemResourceAsStream(PROPERTIES_FILE);
        if (inputStream == null)
        {
            throw new FileNotFoundException("Propery file '" + PROPERTIES_FILE + "' not found in classpath");

        } else
        {
            final Properties properties = new Properties();
            properties.load(inputStream);
            // Allow property overrides
            properties.putAll(System.getProperties());
            // Setting property fields
            setFields(properties);
        }
    }

    private void setFields(Properties properties)
    {
        // Set browserType
        browserType = BrowserType.valueOf(properties.getProperty("browser.type").toUpperCase());
        // Set browserProfile
        browserProfile = BrowserProfile.valueOf(properties.getProperty("browser.profile").toUpperCase());
        // Set baseUrl
        baseUrl = properties.getProperty("base.url");
        // Set chromeDriver
        chromeDriver = properties.getProperty("chrome.driver");
        // Set ieDriver
        ieDriver = properties.getProperty("ie.driver");
    }


}
