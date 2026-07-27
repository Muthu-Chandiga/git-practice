package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testHomePageTitle() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--no-first-run");
        options.addArguments("--disable-features=msEdgeFirstRunExperience");
        options.addArguments("--inprivate");

        WebDriver driver = new EdgeDriver(options);

        try {
            driver.get("https://automationexercise.com");
            Thread.sleep(2000); // give the page a moment to fully load

            String title = driver.getTitle();
            assertEquals("Automation Exercise", title);
        } finally {
            driver.quit();
        }
    }
}