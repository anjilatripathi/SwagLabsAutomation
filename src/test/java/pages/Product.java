package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Product {

    private WebDriver driver;
    private WebDriverWait wait;

    // Common locators
    private By dropDown = By.className("product_sort_container");
    private By productTitles = By.className("inventory_item_name");
    private By productPrices = By.className("inventory_item_price");

    public Product(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void filterNameZtoA() {
        WebElement drop = wait.until(visibilityOfElementLocated(dropDown));
        Select select = new Select(drop);
        select.selectByValue("za");

        wait.until(visibilityOfElementLocated(productTitles));

        List<WebElement> productElements = driver.findElements(productTitles);
        List<String> actualProductNames = new ArrayList<>();
        for (WebElement el : productElements) {
            actualProductNames.add(el.getText().trim());
        }

        List<String> expectedSortedNames = new ArrayList<>(actualProductNames);
        expectedSortedNames.sort(Collections.reverseOrder());

        Assert.assertEquals(actualProductNames, expectedSortedNames,
                "Product list is not sorted from Z to A.");
    }


    public void filterPriceLowToHigh() {
        WebElement drop = wait.until(visibilityOfElementLocated(dropDown));
        Select select = new Select(drop);
        select.selectByValue("lohi");

        wait.until(visibilityOfElementLocated(productPrices));

        List<WebElement> priceElements = driver.findElements(productPrices);
        List<Double> actualPrices = new ArrayList<>();

        for (WebElement el : priceElements) {
            String priceText = el.getText().replace("$", "").trim();
            actualPrices.add(Double.parseDouble(priceText));
        }

        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        Collections.sort(expectedPrices);

        Assert.assertEquals(actualPrices, expectedPrices,
                "Product prices are not sorted from Low to High.");
    }
}
