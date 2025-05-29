package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Cart {
    WebDriver driver;
    WebDriverWait wait;

    By product1 = By.xpath("//div[@class='inventory_item'][1]//button[@class='btn_primary btn_inventory']");
    By product2 = By.xpath("//div[@class='inventory_item'][2]//button[@class='btn_primary btn_inventory']");
    By product3 = By.xpath("//div[@class='inventory_item'][3]//button[@class='btn_primary btn_inventory']");
    By product4 = By.xpath("//div[@class='inventory_item'][4]//button[@class='btn_primary btn_inventory']");
    By product5 = By.xpath("//div[@class='inventory_item'][5]//button[@class='btn_primary btn_inventory']");
    By cart = By.xpath("//*[local-name()='svg']");
    By checkout = By.linkText("CHECKOUT");

    public Cart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Add products to cart
    public void addProductsToCart() {
        WebElement prodButton1 = wait.until(visibilityOfElementLocated(product1));
        prodButton1.click();
        WebElement prodButton2 = wait.until(visibilityOfElementLocated(product2));
        prodButton2.click();
        WebElement prodButton3 = wait.until(visibilityOfElementLocated(product3));
        prodButton3.click();
        WebElement prodButton4 = wait.until(visibilityOfElementLocated(product4));
        prodButton4.click();
        WebElement prodButton5 = wait.until(visibilityOfElementLocated(product5));
        prodButton5.click();

    }

    // Click on cart icon to view cart
    public void goToCart() {
        WebElement cartIcon = wait.until(visibilityOfElementLocated(cart));
        cartIcon.click();
    }

    // Click checkout button in cart page
    public void proceedToCheckout() {
        WebElement checkoutButton = wait.until(visibilityOfElementLocated(checkout));
        checkoutButton.click();
    }
}
