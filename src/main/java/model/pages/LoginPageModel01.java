package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel01 {
    private final WebDriver driver;
    private static final By USERNAME_SEL = By.id("");
    private static final By PASSWORD_SEL = By.id("");
    private static final By LOGIN_BUTTON_SEL = By.id("");

    public LoginPageModel01(WebDriver driver) {
        this.driver = driver;
    }

    public void userName(String username){
        this.driver.findElement(USERNAME_SEL);
    }
    public WebElement password(){
        return this.driver.findElement(PASSWORD_SEL);
    }
    public WebElement loginBtn(){
        return this.driver.findElement(LOGIN_BUTTON_SEL);
    }



}
