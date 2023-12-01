package test;

import driver.DriverFactory;
import model.pages.LoginPageModel03;
import org.openqa.selenium.WebDriver;

public class POMModel03Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPageModel03 loginPage = new LoginPageModel03(driver);
        loginPage.inputUsername("teo@sth.com").inputPassword("12345678").button();
        driver.quit();
    }
}
