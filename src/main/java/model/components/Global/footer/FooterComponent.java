package model.components.Global.footer;

import model.components.Component;
import model.components.ComponentCSSSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
@ComponentCSSSelector(value =".footer")
public class FooterComponent extends Component {
    public FooterComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
    public InformationColumnComponent informationColumnComponent(){
        return findComponent(InformationColumnComponent.class);
    }

    public CustomerServiceColumnCompoment customerServiceColumnCompoment(){
        return findComponent(CustomerServiceColumnCompoment.class);
    }
}
