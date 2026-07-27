package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testHomePageTitle() throws InterruptedException {
System.setProperty("webdriver.edge.driver", "C:/Selenium/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new EdgeDriver(options);

        try {
            driver.get("https://automationexercise.com");
            Thread.sleep(2000);

            String title = driver.getTitle();
            assertEquals("Automation Exercise", title);
        } finally {
            driver.quit();
        }
    }
}