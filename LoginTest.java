package com.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test
    public void testHomePageTitle() {

        // Automatically downloads and configures the correct ChromeDriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Run Chrome in headless mode (recommended for Jenkins)
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://automationexercise.com");

            String actualTitle = driver.getTitle();
            System.out.println("Page Title: " + actualTitle);

            assertEquals("Automation Exercise", actualTitle);

        } finally {
            driver.quit();
        }
    }
}