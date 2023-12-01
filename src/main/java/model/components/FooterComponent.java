package model.components;

import org.openqa.selenium.WebDriver;

@ComponentCSSSelector(value = ".footer")
public class FooterComponent {

    private final WebDriver driver;

    public FooterComponent(WebDriver driver) {
        this.driver = driver;
    }

    // SELECTOR


    // MENTHOD
    public void doSth() {

    }
}
