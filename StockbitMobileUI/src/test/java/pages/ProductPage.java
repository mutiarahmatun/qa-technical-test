package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage {
    AndroidDriver driver;

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void selectProduct(String productName) {
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + productName + "']")).click();
    }

    public void chooseColor(String colorName) {
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + colorName + "']")).click();
    }

    public void addToCart(int quantity) {
        for (int i = 0; i < quantity; i++) {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/cartBt")).click();
        }
    }
}
