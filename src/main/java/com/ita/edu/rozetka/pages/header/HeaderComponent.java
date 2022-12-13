package com.ita.edu.rozetka.pages.header;

import com.ita.edu.rozetka.locators.HeaderLocators;
import com.ita.edu.rozetka.pages.BasePO;
import com.ita.edu.rozetka.pages.logincomponent.LoginModal;
import com.ita.edu.rozetka.pages.searchpage.SearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HeaderComponent extends BasePO {
    WebElement searchInput;
    WebElement loginBtn;
    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchInput() {
        if( searchInput == null){
            searchInput = this.driver.findElement(HeaderLocators.SEARCH_INPUT.getPath());
        }
        return searchInput;
    }
    public WebElement getLoginBtn() {
        if( loginBtn == null){
            loginBtn = this.driver.findElement(HeaderLocators.LOGIN_BTN.getPath());
        }
        return loginBtn;
    }

    public LoginModal clickLoginBtn() {
        this.getLoginBtn().click();
        return new LoginModal(this.driver);
    }

    public SearchPage enterSearchField(String text) {
        getSearchInput().sendKeys(text,  Keys.ENTER);
        sleep(10);
        return new SearchPage(driver);
    }


}
