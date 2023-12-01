package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel02 {
    private final WebDriver driver;
    private static final By USERNAME_SEL = By.cssSelector("div .email");
    private static final By PASSWORD_SEL = By.cssSelector("div .password");
    private static final By BUTTON_SEL = By.cssSelector("div.buttons input[type='submit']");
    public LoginPageModel02(WebDriver driver) {
        this.driver = driver;
    }
    public void inputUsername(String usernameStr){
        this.driver.findElement(USERNAME_SEL).sendKeys(usernameStr);
    }
    public void inputPassword(String passwordStr){
        this.driver.findElement(PASSWORD_SEL).sendKeys(passwordStr);
    }
    public void button(){
        this.driver.findElement(BUTTON_SEL).click();
    }
}
