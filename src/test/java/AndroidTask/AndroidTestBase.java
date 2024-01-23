package AndroidTask;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTestBase {
    public static AndroidDriver driver;
    public static void Android_setUp()throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "Pixel_7");
        capabilities.setCapability("app", "C:\\Users\\Breadfast\\IdeaProjects\\AndroidTask\\Build\\Weather Forecast_3.6_apkcombo.com.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilities);


    }
    public static void tearDown()
    {
        if (null != driver)
        {
            driver.quit();
        }
    }
}
