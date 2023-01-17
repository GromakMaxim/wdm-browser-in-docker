package org.example;

import lombok.Getter;

public enum Images {
    CHROME_96("selenium/standalone-chrome:96.0"),
    CHROME_97("selenium/standalone-chrome:97.0"),
    CHROME_98("selenium/standalone-chrome:98.0"),
    CHROME_99("selenium/standalone-chrome:99.0"),
    CHROME_100("selenium/standalone-chrome:100.0"),
    CHROME_101("selenium/standalone-chrome:101.0"),
    CHROME_102("selenium/standalone-chrome:102.0"),
    CHROME_103("selenium/standalone-chrome:103.0"),
    CHROME_104("selenium/standalone-chrome:104.0"),
    CHROME_105("selenium/standalone-chrome:105.0"),
    CHROME_106("selenium/standalone-chrome:106.0"),
    CHROME_107("selenium/standalone-chrome:107.0"),
    CHROME_108("selenium/standalone-chrome:108.0"),
    ;

    @Getter
    private String image;

    Images(String image) {
        this.image = image;
    }
}
