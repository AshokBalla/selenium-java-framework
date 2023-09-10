package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By logoutButton = By.cssSelector("a.button.secondary.radius");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoutVisible() {
        return driver.findElements(logoutButton).size() > 0;
    }
}
