package DP_FactoryPattern2;

import org.openqa.selenium.WebDriver;

public class FirefoxDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        return new MyFirefoxDriver();
    }
}



