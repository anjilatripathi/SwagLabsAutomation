package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import java.time.Duration;

public class Base
{
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeSuite
    public void setup()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1");
    }
    @AfterSuite
    public void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
