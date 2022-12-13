package com.ita.edu.rozetka.pages;

import org.openqa.selenium.WebDriver;

public class BasePO {
    protected WebDriver driver;

    public BasePO(WebDriver driver) {
        this.driver = driver;
    }
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
