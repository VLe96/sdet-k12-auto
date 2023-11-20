package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrameInteractions {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/iframe";
  private static final By IFRAME = By.cssSelector("iframe[id^='mce']");

  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
      WebElement iframEle = driver.findElement(IFRAME);
      //Switch to the target iframe
      driver.switchTo().frame(iframEle);
      //Interact with iframe's elemes
      WebElement inputFields = driver.findElement(By.id("tinymce"));
      inputFields.click();
      inputFields.clear();
      inputFields.sendKeys("Hello!!");
      debugWait();
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
  private static void debugWait(){
    try{
      Thread.sleep(1000);
    }catch (Exception ingnore){
    }
  }
}
