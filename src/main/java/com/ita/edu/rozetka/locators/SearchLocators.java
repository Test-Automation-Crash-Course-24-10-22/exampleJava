package com.ita.edu.rozetka.locators;

import org.openqa.selenium.By;

public enum SearchLocators {
    CARDS(By.xpath("//li[contains(@class, 'catalog-grid__cell')]"));

    private final By path;

    SearchLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
