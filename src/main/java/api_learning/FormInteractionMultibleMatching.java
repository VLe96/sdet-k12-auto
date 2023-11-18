package api_learning;

import driver.DriverFactory;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class FormInteractionMultibleMatching {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
  private static final By userNameSel = By.tagName("input");
  private static final By clickButtonSel = By.cssSelector("#login [type='submit']");
  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
      List<WebElement> loginFieldaEles = driver.findElements(userNameSel);
      if(!loginFieldaEles.isEmpty()){
        final int USERNAME_INDEX = 0;
        final int PASSWORD_INDEX = 1;
        loginFieldaEles.get(USERNAME_INDEX).sendKeys("teo@something.com");
        loginFieldaEles.get(PASSWORD_INDEX).sendKeys("password_values");
      }else{
        throw new NoSuchElementException("No login fields found!");
      }
      driver.findElement(clickButtonSel).click();
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}
