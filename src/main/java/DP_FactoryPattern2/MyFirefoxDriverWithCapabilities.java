package DP_FactoryPattern2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriverWithCapabilities extends FirefoxDriver {

    public MyFirefoxDriverWithCapabilities() {
        super(getCustomCapabilities());
    }

    private static FirefoxOptions getCustomCapabilities() {
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--start-maximized");
        return options;
    }
}
