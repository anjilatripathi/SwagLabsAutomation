package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base
{
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
