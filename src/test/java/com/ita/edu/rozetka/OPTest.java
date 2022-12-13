package com.ita.edu.rozetka;

import com.ita.edu.rozetka.pages.homepage.HomePage;
import com.ita.edu.rozetka.pages.logincomponent.LoginModal;
import com.ita.edu.rozetka.pages.searchpage.CardComponent;
import com.ita.edu.rozetka.runers.BaseRuner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class OPTest extends BaseRuner {
    @BeforeMethod
    public void afterMethod() {
        setDriver();
    }


    @Test
    public void loginTest() {
        new HomePage(driver).getHeaderComponent().clickLoginBtn().successLogin("tiger38@gmail.com", "11111111");

    }

    @Test
    public void searchS22Test() {
        List<CardComponent> cards = new HomePage(driver).getHeaderComponent().clickLoginBtn().successLogin("tiger38@gmail.com", "11111111").getHeaderComponent().enterSearchField("S22").getCards();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(cards.get(0).getTitle().getText(), "Мобільний телефон Samsung Galaxy S22 Plus 8/256 GB Phantom Black (SM-S906BZKGSEK)", "1");
        softAssert.assertEquals(cards.get(1).getTitle().getText(), "Мобільний телефон Samsung Galaxy S22 Ultra 12/512 GB Green (SM-S908BZGHSEK)", "2");
        softAssert.assertEquals(cards.get(3).getTitle().getText(), "Мобільний телефон Samsung Galaxy S22 8/256 GB Phantom Black (SM-S901BZKGSEK)", "4");
        softAssert.assertAll();
    }

    @Test
    public void loginError() {
        LoginModal loginModal = new HomePage(driver).getHeaderComponent().clickLoginBtn();
        String emailErrorMessage = loginModal.getEmailInput().sendKeys("test").getErrorMessage();
        String passwordLabel = loginModal.getPasswordInput().getLabel();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(emailErrorMessage, "Введено невірну адресу ел. пошти або номер телефону");
        softAssert.assertEquals(passwordLabel, "Пароль");
        softAssert.assertAll();

    }

}
