package test;

import driver.DriverFactory;
import model.pages.LoginPageModel01;
import org.openqa.selenium.WebDriver;

public class POMModel01Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPageModel01 loginPage = new LoginPageModel01(driver);
        loginPage.username().sendKeys("Teo@something.com");
        loginPage.password().sendKeys("12345678");
        loginPage.button().click();
        driver.quit();
    }
}
