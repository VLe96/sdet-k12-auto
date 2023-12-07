package model.components.Global.Header;

import model.components.Component;
import model.components.ComponentCSSSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCSSSelector(".top-menu")
public class TopMenuComponent extends Component {
    public TopMenuComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }


}
