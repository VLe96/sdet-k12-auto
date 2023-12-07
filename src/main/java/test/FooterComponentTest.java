package test;

import driver.DriverFactory;
import model.components.Global.footer.CustomerServiceColumnCompoment;
import model.components.Global.footer.FooterColumnComponent;
import model.components.Global.footer.FooterComponent;
import model.components.Global.footer.InformationColumnComponent;
import model.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterComponentTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://demowebshop.tricentis.com/");
        try{
            HomePage homePage = new HomePage(driver);
            FooterComponent footerComponent = homePage.footerComponent();
            InformationColumnComponent informationColumnComponent = footerComponent.informationColumnComponent();
            CustomerServiceColumnCompoment customerServiceColumnCompoment = footerComponent.customerServiceColumnCompoment();
            testFooterComp(informationColumnComponent);
            testFooterComp(customerServiceColumnCompoment);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }

    private static void testFooterComp(FooterColumnComponent footerColumnComponent){
        System.out.println(footerColumnComponent.headerElement().getText());
        for (WebElement linkEle : footerColumnComponent.linkElement()) {
            System.out.println(linkEle.getText() + ": " + linkEle.getAttribute("href"));
        }
        System.out.println("=====");
    }
}
