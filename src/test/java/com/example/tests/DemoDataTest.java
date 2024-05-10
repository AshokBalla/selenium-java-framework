package com.example.tests;

import com.example.core.BaseTest;
import org.testng.annotations.Test;

public class DemoDataTest extends BaseTest {
    @Test
    public void sample() {
        // placeholder demo test that doesn't require login
        driver.get(System.getProperty("base.url", "https://the-internet.herokuapp.com") + "/");
    }
}
