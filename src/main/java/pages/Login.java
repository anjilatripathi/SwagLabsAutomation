package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Login {
    protected WebDriver driver;
    protected WebDriverWait wait;

    By userNameField = By.id("user-name");
    By passWordField = By.id("password");
    By btnField = By.id("login-button");

    public Login(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void credentials(String username, String password) {
        WebElement userName1 = wait.until(visibilityOfElementLocated(userNameField));
        userName1.clear();
        userName1.sendKeys(username);
        WebElement passWord1 = wait.until(visibilityOfElementLocated(passWordField));
        passWord1.clear();
        passWord1.sendKeys(password);
        WebElement btn1 = wait.until(visibilityOfElementLocated(btnField));
        btn1.click();
    }

    public void inValidLogin(String username, String password) {
        credentials(username, password);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/v1/"),
                "Due to invalid user access, Login failed and stayed on the login page");
    }

    public void validLogin(String username, String password) {
        credentials(username, password);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"),
                "Expected to navigate to inventory.html after valid login, but got: " + currentUrl);
    }
}
