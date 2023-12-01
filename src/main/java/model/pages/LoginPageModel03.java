package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageModel03 {
    private final WebDriver driver;
    private static final By USERNAME_SEL = By.cssSelector("div .email");
    private static final By PASSWORD_SEL = By.cssSelector("div .password");
    private static final By BUTTON_SEL = By.cssSelector("div.buttons input[type='submit']");
    public LoginPageModel03(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPageModel03 inputUsername(String usernameStr){
        this.driver.findElement(USERNAME_SEL).sendKeys(usernameStr);
        return this;
    }
    public LoginPageModel03 inputPassword(String passwordStr){
        this.driver.findElement(PASSWORD_SEL).sendKeys(passwordStr);
        return this;
    }
    public LoginPageModel03 button(){
        this.driver.findElement(BUTTON_SEL).click();
        return this;
    }
}
