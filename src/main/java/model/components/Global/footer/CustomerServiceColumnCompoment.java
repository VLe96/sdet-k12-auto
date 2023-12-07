package model.components.Global.footer;

import model.components.ComponentCSSSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCSSSelector(".column.customer-service")

public class CustomerServiceColumnCompoment extends FooterColumnComponent {
    public CustomerServiceColumnCompoment(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
