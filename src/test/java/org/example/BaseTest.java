package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver;

    WebDriverManager wdm = WebDriverManager.chromedriver();

    @BeforeEach
    void setupTest() {
        try {
            driver = wdm
                    .browserInDocker()
                    .dockerCustomImage(Images.CHROME_104.getImage())
                    .create();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
