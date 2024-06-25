package DP_FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver implements BrowserDriver {
    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
