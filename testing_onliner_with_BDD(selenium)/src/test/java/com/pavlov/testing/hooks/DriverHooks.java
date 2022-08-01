package com.pavlov.testing.hooks;

import com.pavlov.testing.driverfactory.WebDriverFactory;
import io.cucumber.java.After;

public class DriverHooks {
    @After
    public void quitDriver() {
        WebDriverFactory.closeDriver();
    }
}
