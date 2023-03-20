package com.example.core.internal;

import com.example.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

// Internal runtime helper (no TestNG annotations here)
public class MainBase {
    protected WebDriver driver;

    public void initDriver() {
        DriverFactory.createDriver();
        driver = DriverFactory.getDriver();
    }

    public void cleanupDriver() {
        DriverFactory.quitDriver();
    }
}
