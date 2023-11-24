package api_learning;

import Support.ui.WaitForElementenbale;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class ExplicicitWait {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
  private static final By USERNAME_SEL = By.id("username");

  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
      // Implicit wait: Applied globally for the whole session when finding element(s) | Interval time 500 s:
      // nhược: làm chậm tiến trình chạy khi ko thấy elements. càng nhiều script thì càng chậm
      // explicit wait: Applied locally / for a specific elements
      // thread.sleep ->  của Java
      WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
      // webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taolao")));
     //webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("taolao"))));

      // Trigger action and verify another element disappears
//      try{
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taolao")));
//      }catch(TimeoutException timeoutException){
//
//      }

      //Using customneized explicitwait class
      webDriverWait.until(new WaitForElementenbale(By.cssSelector("#somthing")));

    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}


