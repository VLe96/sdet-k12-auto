package api_learning;

import Support.ui.WaitForElementenbale;
import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSAlert {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/javascript_alerts";
  private static final By JS_ALERT_SEL = By.cssSelector("[onclick='jsAlert()']");
  private static final By JS_ALERT_CONFIRM_SEL = By.cssSelector("[onclick='jsConfirm()']");
  private static final By JS_ALERT_PROMT_SEL = By.cssSelector("[onclick='jsPrompt()']");
  private static final By RESUL_SEL = By.cssSelector("#result");

  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    try{
      WebElement resultEle = driver.findElement(RESUL_SEL);
      //JS ALERT interactions
      handleAlert(driver, JS_ALERT_SEL, true);
      System.out.println(resultEle.getText());
      Thread.sleep(2000);
      //JS ALERT confirm interactions
      handleAlert(driver, JS_ALERT_CONFIRM_SEL, false);
      System.out.println(resultEle.getText());
      Thread.sleep(2000);
      //JS ALERT prompt interactions
      handleAlert(driver, JS_ALERT_PROMT_SEL, true, "Hello all!!!");
      System.out.println(resultEle.getText());
      Thread.sleep(2000);
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
  public static void handleAlert(WebDriver driver, By triggerBtn, boolean isAccepting, String... messages){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.findElement(triggerBtn).click();
    Alert jsAlert = wait.until(ExpectedConditions.alertIsPresent());
    if(messages.length > 0){
      jsAlert.sendKeys(messages[0]);
      makeJsAlertDecision(jsAlert, isAccepting);
    }else {
      makeJsAlertDecision(jsAlert, isAccepting);
    }
  }
  private static void makeJsAlertDecision(Alert jsAlert, boolean isAccepting) {
    if (isAccepting){
      jsAlert.accept();
    }else {
      jsAlert.dismiss();
    }
  }

}



