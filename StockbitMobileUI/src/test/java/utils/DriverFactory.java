package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                UiAutomator2Options options = new UiAutomator2Options()
                        .setDeviceName("Android Emulator")
                        .setPlatformName("Android")
                        .setApp(System.getProperty("user.dir") + "/app/mda-1.0.13-15.apk")
                        .setAutomationName("UiAutomator2");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid Appium server URL", e);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
