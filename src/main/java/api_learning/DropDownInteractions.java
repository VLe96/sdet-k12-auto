package api_learning;

import Support.ui.SelectEX;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownInteractions {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/dropdown";
  private static final By DROPDOWN_SEL = By.id("dropdown");

  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
      //locate and select the dropdown
      WebElement dropDownEle = driver.findElement(DROPDOWN_SEL);
      SelectEX select = new SelectEX(dropDownEle);
      // by visible text
      select.selectOption1();
      debugWait();
      // by index
      select.selectByIndex(2);
      debugWait();
      // by value
      select.selectByValue("1");
      debugWait();
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }

  private static void debugWait(){
    try{
      Thread.sleep(1500);
    }catch(Exception ignored){
    }
  }
}
