package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testHomePageTitle() {
        System.setProperty("webdriver.edge.driver", "C:/Selenium/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://automationexercise.com");
        String title = driver.getTitle();

        assertEquals("Automation Exercise", title);

        driver.quit();
    }
}