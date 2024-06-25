package DP_FactoryPattern2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests {
    private WebDriver driver;


    @BeforeClass
    public void setup() {
        WebDriverFactory edgeFactory = new EdgeDriverWithCapabilitiesFactory();
        driver = edgeFactory.createWebDriver();

    }


    @Test
    public void testCase1() {
        driver.get("https://www.google.com/");

    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();

        }

    }
}

