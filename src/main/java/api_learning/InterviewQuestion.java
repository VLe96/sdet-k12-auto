package api_learning;

import dev.failsafe.internal.util.Assert;
import driver.DriverFactory;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InterviewQuestion {
  private static final By userNameSel = By.id("username");
  public static void main(String[] args) {
    WebDriver driver = DriverFactory.getWebDriver();
    List<WebElement> usernameEles = driver.findElements(userNameSel);

    if(!usernameEles.isEmpty()){
  //    Assert.fail("The element is not found");
    }
  }

}
