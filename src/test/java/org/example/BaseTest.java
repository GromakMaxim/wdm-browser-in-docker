package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver;

    WebDriverManager wdm = WebDriverManager.chromedriver();

    @BeforeEach
    void setupTest() {
        driver = wdm
                .browserInDocker()
                .browserVersion("96.0")
                .create();
    }
}
