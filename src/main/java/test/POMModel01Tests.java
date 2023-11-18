package test;

import driver.DriverFactory;
import model.pages.LoginPageModel01;
import org.openqa.selenium.WebDriver;

public class POMModel01Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        LoginPageModel01 loginPage = new LoginPageModel01((driver));
        driver.get("https://");
        loginPage.userName("te@gmail");
        loginPage.password().sendKeys("12345");
        loginPage.loginBtn().click();
    }
}
