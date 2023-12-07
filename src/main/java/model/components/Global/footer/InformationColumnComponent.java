package model.components.Global.footer;

import model.components.ComponentCSSSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCSSSelector(".column.information")

public class InformationColumnComponent extends FooterColumnComponent {
    public InformationColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
