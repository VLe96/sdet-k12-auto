package test;

import driver.DriverFactory;
import model.pages.LoginPageModel01;
import model.pages.LoginPageModel02;
import org.openqa.selenium.WebDriver;

public class POMModel02Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPageModel02 loginPage = new LoginPageModel02(driver);
        loginPage.inputUsername("teo@sth.com");
        loginPage.inputPassword("12345678");
        loginPage.button();
        driver.quit();
    }
}
