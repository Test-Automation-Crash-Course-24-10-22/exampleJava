package com.ita.edu.rozetka.locators;

import org.openqa.selenium.By;

public enum HeaderLocators {
    SEARCH_INPUT(By.name("search")),
    LOGIN_BTN(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
    private final By path;

    HeaderLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
