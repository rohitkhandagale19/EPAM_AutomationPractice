package DP_FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyEdgeDriver implements BrowserDriver {
    @Override
    public WebDriver getDriver() {
        return new EdgeDriver();
    }
}