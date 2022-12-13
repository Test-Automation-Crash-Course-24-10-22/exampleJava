package com.ita.edu.rozetka.locators;

import org.openqa.selenium.By;

public enum LoginLocators {
    EMAIL_FIELD(By.xpath("//input[@id = 'auth_email']")),
    PASSWORD_FIELD(By.xpath("//input[@id = 'auth_pass']")),
    ENTER_BUTTON(By.xpath("//button[@class = 'button button--large button--green auth-modal__submit ng-star-inserted']")),
    ICON_I_AM_NOT_ROBOT(By.id("ngrecaptcha-0"));

    private final By path;

    LoginLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
