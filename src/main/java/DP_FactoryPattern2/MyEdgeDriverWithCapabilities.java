package DP_FactoryPattern2;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MyEdgeDriverWithCapabilities extends EdgeDriver {

    public MyEdgeDriverWithCapabilities() {
        super(getCustomCapabilities());
    }

    private static EdgeOptions getCustomCapabilities() {
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--start-maximized");
        return options;
    }
}
