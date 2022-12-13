package com.ita.edu.rozetka.pages.searchpage;

import com.ita.edu.rozetka.locators.CardLocators;
import com.ita.edu.rozetka.locators.HeaderLocators;
import com.ita.edu.rozetka.pages.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardComponent extends BasePO {

    private WebElement lickeBtn;
    private WebElement title;
    private WebElement root;


    public CardComponent(WebDriver driver) {
        super(driver);
    }
    public CardComponent(WebDriver driver , WebElement root) {
        super(driver);
        this.root = root;
    }

    public WebElement getLickeBtn() {
        if (lickeBtn == null) {
            lickeBtn = this.root.findElement(CardLocators.LIKE.getPath());
        }
        return lickeBtn;
    }

    public WebElement getTitle() {
        if (title == null) {
            title = this.root.findElement(CardLocators.TiTLE.getPath());
        }
        return title;
    }
}
