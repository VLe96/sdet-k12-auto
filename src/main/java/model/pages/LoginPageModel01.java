package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel01 {
    private final WebDriver driver;
    private static final By USERNAME_SEL = By.cssSelector("div .email");
    private static final By PASSWORD_SEL = By.cssSelector("div .password");
    private static final By BUTTON_SEL = By.cssSelector("div.buttons input[type='submit']");
    public LoginPageModel01(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement username(){
        return this.driver.findElement(USERNAME_SEL);
    }public WebElement password(){
        return this.driver.findElement(PASSWORD_SEL);
    }public WebElement button(){
        return this.driver.findElement(BUTTON_SEL);
    }
}
