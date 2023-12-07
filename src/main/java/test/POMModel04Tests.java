package test;

import driver.DriverFactory;
import model.pages.BasePage;
import model.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class POMModel04Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();

        HomePage homePage = new HomePage(driver);
      //  homePage.footerComponent().doSth();
    }
}
