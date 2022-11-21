package com.ita.edu.rozetka;

import com.ita.edu.rozetka.runers.BaseRuner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExampl extends BaseRuner {
    @BeforeClass
    public void  BeforeClass() {
        setDriver();
        WebElement btnProfile = driver.findElement(By.ByXPath.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button"));
        btnProfile.click();
        WebElement email = driver.findElement(By.ByXPath.xpath("//*[@id=\"auth_email\"]"));
        email.sendKeys("email");
        WebElement pass = driver.findElement(By.ByXPath.xpath("//*[@id=\"auth_pass\"]"));
        pass.sendKeys("pass");
        WebElement btnLogin = driver.findElement(By.ByXPath.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[1]"));
        btnLogin.click();
        WebElement btnClPop = driver.findElement(By.ByXPath.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[1]/button"));
        btnClPop.click();
        btnProfile.click();
        btnLogin.click();



    }

    @AfterTest
    public void afterSuite() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testClick() {
        WebElement btn = driver.findElement(By.ByXPath.xpath("//*[@id='fat-menu']"));
        btn.click();

    }
    @Test
    public void testFiend() {
        WebElement input = driver.findElement(By.ByXPath.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/div/div[1]/input"));
        input.sendKeys("s21");
        WebElement btn = driver.findElement(By.ByXPath.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/button"));
        btn.click();


    }

}
