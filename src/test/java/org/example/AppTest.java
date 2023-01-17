package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AppTest extends BaseTest {
    @Test
    public void shouldAnswerWithTrue() {
        this.driver.get("chrome://version");
        var target = new WebDriverWait(this.driver, Duration.ofSeconds(5))
                .withMessage("some error message")
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("version")));
        System.out.println(target.getText());
    }
}
