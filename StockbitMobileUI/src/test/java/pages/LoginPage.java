package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    AndroidDriver driver;
    By usernameField = By.id("com.saucelabs.mydemoapp.android:id/nameET");
    By passwordField = By.id("com.saucelabs.mydemoapp.android:id/passwordET");
    By loginButton = By.id("com.saucelabs.mydemoapp.android:id/loginBtn");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
