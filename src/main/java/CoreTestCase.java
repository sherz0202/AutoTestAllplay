import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;

public class CoreTestCase extends TestCase {

    protected AppiumDriver driver;

    @Override
    public void setUp() throws Exception
    {
        super.setUp();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "POCO");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("udid", "EQMJTSYPWC7PAQS4");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "uz.allplay.app");
        capabilities.setCapability("appActivity", ".section.StartActivity");
        capabilities.setCapability("appium:noReset",true);

        String appiumURL = "http://127.0.0.1:4723/wd/hub";
        driver = new AndroidDriver(new URL(appiumURL), capabilities);
    }

    @Override
    public void tearDown() throws Exception
    {
        driver.quit();
        super.tearDown();
    }

}
