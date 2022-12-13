package com.ita.edu.rozetka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class temp {
    private ChromeDriver driver;

    @BeforeTest
    public void start() {
        WebDriverManager.chromedriver().setup();
//        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void inputField(){
        driver.get("https://rozetka.com.ua/ua/");
        WebElement input = driver.findElement(By.xpath("//input[@class = 'search-form__input ng-untouched ng-pristine ng-valid']"));
        input.sendKeys("asus", Keys.ENTER, Keys.CLEAR);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        input.sendKeys("iphone", Keys.ENTER, Keys.CLEAR);
        input.sendKeys("fs.'th;otht", Keys.ENTER, Keys.CLEAR);
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
