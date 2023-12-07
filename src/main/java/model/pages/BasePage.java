package model.pages;

import model.components.Component;
import model.components.Global.footer.FooterComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends Component {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver, driver.findElement(By.tagName("html")));
        this.driver = driver;
    }

    // SELECTOR

    // MENTHOD

    public FooterComponent footerComponent(){
        return findComponent(FooterComponent.class);
    }
}
