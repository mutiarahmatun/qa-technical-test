package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.junit.Assert;
import java.util.List;

public class CartPage {
    AndroidDriver driver;
    By cartIcon = By.id("com.saucelabs.mydemoapp.android:id/cartIV");
    By cartItemNames = By.id("com.saucelabs.mydemoapp.android:id/titleTV");

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public void verifyCartItems(String productName, int expectedCount) {
        List<?> items = driver.findElements(cartItemNames);
        long matchCount = items.stream()
                .filter(e -> ((io.appium.java_client.MobileElement) e).getText().equals(productName))
                .count();
        Assert.assertEquals(expectedCount, matchCount);
    }
}
