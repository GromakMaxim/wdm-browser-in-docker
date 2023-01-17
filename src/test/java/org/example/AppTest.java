package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.id;


public class AppTest extends BaseTest {
    @Test
    public void shouldAnswerWithTrue() {
        this.driver.get("chrome://version");
        var target = new WebDriverWait(this.driver, Duration.ofSeconds(5))
                .withMessage("some error message")
                .until(ExpectedConditions.visibilityOfElementLocated(id("version")));
        System.out.println(target.getText());
    }
}
