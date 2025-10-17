package features.utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverSetup {
    public static AppiumDriver driver;
    public static void initialize() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", System.getProperty("user.dir") + "/app/mda-1.0.13-15.apk");
        caps.setCapability("automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }
    public static AppiumDriver getDriver() { return driver; }
}