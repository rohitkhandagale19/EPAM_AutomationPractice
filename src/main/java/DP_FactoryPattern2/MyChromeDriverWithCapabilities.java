package DP_FactoryPattern2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities extends ChromeDriver {

    public MyChromeDriverWithCapabilities() {
        super(getCustomCapabilities());
    }

    private static ChromeOptions getCustomCapabilities() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        return options;
    }
}

