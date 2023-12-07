package model.components.Global.product;

import model.components.Component;
import model.components.ComponentCSSSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCSSSelector(value = ".product-item")
public class ProductItemComponent extends Component {
    private static final By PRODUCT_TITLE_SEL = By.tagName("h2");
    public ProductItemComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public  WebElement producttitleEle(){
        return this.component.findElement(PRODUCT_TITLE_SEL);
    }
}
