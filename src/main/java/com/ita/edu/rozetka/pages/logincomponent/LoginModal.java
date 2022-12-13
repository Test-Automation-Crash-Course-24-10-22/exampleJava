package com.ita.edu.rozetka.pages.logincomponent;

import com.ita.edu.rozetka.elements.InputElement;
import com.ita.edu.rozetka.locators.LoginLocators;
import com.ita.edu.rozetka.pages.BasePO;
import com.ita.edu.rozetka.pages.homepage.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModal extends BasePO {

    protected InputElement emailInput;
    protected InputElement passwordInput;
    protected WebElement enterButton;
    protected WebElement iconIAmNotRobot;

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    public InputElement getEmailInput() {
        if (emailInput == null) {
//            emailInput = new InputElement(this.driver.findElement(LoginLocators.EMAIL_FIELD.getPath()));
            emailInput = new InputElement(this.driver, LoginLocators.EMAIL_FIELD.getPath());
        }
        return emailInput;
    }

    public InputElement getPasswordInput() {
        if (passwordInput == null) {
            passwordInput = new InputElement(driver, LoginLocators.PASSWORD_FIELD.getPath());
        }
        return passwordInput;
    }

    public WebElement getEnterButton() {
        if (enterButton == null) {
            enterButton = this.driver.findElement(LoginLocators.PASSWORD_FIELD.getPath());
        }
        return enterButton;
    }

    public WebElement getIconIAmNotRobot() {
        if (iconIAmNotRobot == null) {
            iconIAmNotRobot = this.driver.findElement(LoginLocators.ICON_I_AM_NOT_ROBOT.getPath());
        }
        return iconIAmNotRobot;
    }

    public HomePage successLogin(String email, String password) {
        getEmailInput().sendKeys(email);
        getPasswordInput().sendKeys(password);
        getEnterButton().click();
        sleep(5);
        return new HomePage(driver);
    }
}
