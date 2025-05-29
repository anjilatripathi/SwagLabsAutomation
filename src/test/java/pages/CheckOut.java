package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class CheckOut
{
    WebDriver driver;
    WebDriverWait wait;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By button = By.xpath("//input[@type='submit']");
    By finish = By.className("btn_action");

    public CheckOut(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public void checkOut(String fname, String lname , String code)
    {
        WebElement fname1 = wait.until(visibilityOfElementLocated(firstName));
        fname1.sendKeys(fname);
        WebElement lname1 = wait.until(visibilityOfElementLocated(lastName));
        lname1.sendKeys(lname);
        WebElement zcode = wait.until(visibilityOfElementLocated(zipCode));
        zcode.sendKeys(code);
        WebElement btn = wait.until(visibilityOfElementLocated(button));
        btn.click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("v1/checkout-step-two.html"),"Not redirected to Checkout Overview Page");

        WebElement finishBtn = wait.until(visibilityOfElementLocated(finish));
        finishBtn.click();

        String currentUrl1 = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl1.contains("v1/checkout-complete.html"),"Not redirected to Finish Page");
    }
}