package com.ita.edu.rozetka.locators;

import org.openqa.selenium.By;

public enum  CardLocators {
    LIKE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/div[1]/app-goods-wishlist/button")),
    TiTLE(By.xpath(".//span[contains(@class, 'goods-tile__title')]"));

    private final By path;

    CardLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
