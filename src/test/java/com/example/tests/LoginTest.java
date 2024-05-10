package com.example.tests;

import com.example.core.BaseTest;
import com.example.pages.LoginPage;
import com.example.pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogin() {
        String base = System.getProperty("base.url", "https://the-internet.herokuapp.com");
        LoginPage login = new LoginPage(driver);
        login.open(base);
        login.login("tomsmith","SuperSecretPassword!");
        SecureAreaPage secure = new SecureAreaPage(driver);
        Assert.assertTrue(secure.isLogoutVisible(), "Logout button should be visible after login");
    }

    @Test
    public void failedLogin() {
        String base = System.getProperty("base.url", "https://the-internet.herokuapp.com");
        LoginPage login = new LoginPage(driver);
        login.open(base);
        login.login("wrong","wrongpass");
        String flash = login.getFlashText();
        Assert.assertTrue(flash.contains("Your username is invalid"), "Expected invalid username message");
    }
}
