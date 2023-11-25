package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSExcutor {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/floating_menu";
  private static final String TO_BOTTOM_JS_SNIPPET = "window.scrollTo(0, document.body.scrollHeight);";
  private static final String TO_TOP_JS_SNIPPET = "window.scrollTo(document.body.scrollHeight, 0);";


  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    try{
      //Scroll to bottom
      JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
      javascriptExecutor.executeScript(TO_BOTTOM_JS_SNIPPET);
      Thread.sleep(3000);
      //Scroll to top
      javascriptExecutor.executeScript(TO_TOP_JS_SNIPPET);
      Thread.sleep(3000);

      //make a 4px solid red border around the menu element
      javascriptExecutor.executeScript("document.querySelector('h3').setAttribute('style'," +
                      "'border: 4px solid red;');", driver.findElement(By.tagName("h3")));
      javascriptExecutor.executeScript("document.querySelector('a').removeAttribute('target');"
              , driver.findElement(By.tagName("a"))); // run out error zero size
      driver.findElement(By.tagName("a")).click();
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}



