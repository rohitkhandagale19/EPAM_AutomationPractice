package DP_FactoryPattern;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Tests {
    private WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        BrowserDriver driver = BrowserDriverFactory.getBrowserDriver(BrowserType.CHROME);
        webDriver = driver.getDriver();
    }

    @Test
    public void testCase1() {
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");

    }

    @AfterClass
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}

