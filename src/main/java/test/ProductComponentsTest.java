package test;

import driver.DriverFactory;
import model.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class ProductComponentsTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://demowebshop.tricentis.com/");
        try{
            HomePage homePage = new HomePage(driver);
            homePage.productItemComponentList().forEach(productItemComponent -> {
                System.out.println(productItemComponent.producttitleEle().getText());
            });
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
