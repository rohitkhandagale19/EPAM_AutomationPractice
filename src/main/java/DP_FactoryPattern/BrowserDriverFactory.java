package DP_FactoryPattern;

public class BrowserDriverFactory {
    public static BrowserDriver getBrowserDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                return new MyChromeDriver();
            case FIREFOX:
                return new MyFirefoxDriver();
            case EDGE:
                return new MyEdgeDriver();
            default:
                throw new IllegalArgumentException("Unknown browser type: " + browserType);
        }
    }
}

