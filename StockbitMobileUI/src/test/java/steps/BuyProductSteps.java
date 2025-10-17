package steps;

import io.cucumber.java.en.*;
import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import utils.DriverFactory;

public class BuyProductSteps {
    AndroidDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;

    @Given("user opens the demo app")
    public void openApp() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @When("user logs in with valid credentials")
    public void login() {
        loginPage.login("bod@example.com", "10203040");
    }

    @And("user selects {string}")
    public void selectProduct(String productName) {
        productPage.selectProduct(productName);
    }

    @And("user selects color {string}")
    public void selectColor(String color) {
        productPage.chooseColor(color);
    }

    @And("user adds {int} items to the cart")
    public void addItems(int quantity) {
        productPage.addToCart(quantity);
    }

    @Then("user should see {int} {string} items in the checkout summary")
    public void verifyCart(int count, String productName) {
        cartPage.openCart();
        cartPage.verifyCartItems(productName, count);
        DriverFactory.quitDriver();
    }
}
