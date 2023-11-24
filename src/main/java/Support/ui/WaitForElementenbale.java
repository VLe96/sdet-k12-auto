package Support.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitForElementenbale implements ExpectedCondition<Boolean> { //khi isa thì phải overwriter lại nếu cần

    private By selector;

    public WaitForElementenbale(By selector) {
        this.selector = selector;
    }

    @Override
    public Boolean apply(WebDriver driver) {
        return driver.findElement(selector).isEnabled();
    }

    @Override
    public String toString() {
        return "WaitForElementenbale{" +
                "selector=" + selector +
                '}';
    }
}
