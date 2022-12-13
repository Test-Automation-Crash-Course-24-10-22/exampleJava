package com.ita.edu.rozetka.pages.searchpage;

import com.ita.edu.rozetka.locators.SearchLocators;
import com.ita.edu.rozetka.pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage  extends BasePageWithHeader {
    private List<CardComponent> items;
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public List<CardComponent> getCards() {
        items = new ArrayList<>();
        List<WebElement> elements = driver.findElements(SearchLocators.CARDS.getPath());
        for(WebElement catd: elements) {
            items.add(new CardComponent(driver, catd));
        }
        return items;
    }
}
