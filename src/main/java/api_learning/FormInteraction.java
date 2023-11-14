package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FormInteraction {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
  private static final By userNameSel = By.id("username");
  private static final By passwordSel = By.cssSelector("#password");
  private static final By clickButtonSel = By.cssSelector("#login [type='submit']");
  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
      WebElement usernameEle = driver.findElement(userNameSel);
      WebElement passwordEle = driver.findElement(passwordSel);
      WebElement clickButtonEle = driver.findElement(clickButtonSel);

      driver.navigate().refresh();
      usernameEle = driver.findElement(userNameSel);
      passwordEle = driver.findElement(passwordSel);
      usernameEle.sendKeys("tomsmith");
      passwordEle.sendKeys("SuperSecretPassword!");
      clickButtonEle.click();

      driver.navigate().back();

    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}
