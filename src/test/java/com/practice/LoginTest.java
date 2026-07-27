package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testHomePageTitle() {
        System.setProperty("webdriver.chrome.driver", "PATH_TO_CHROMEDRIVER");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com");
        String title = driver.getTitle();

        assertEquals("Automation Exercise", title);

        driver.quit();
    }
}