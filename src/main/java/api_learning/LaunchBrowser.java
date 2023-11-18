package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;


public class LaunchBrowser {
  public static void main(String[] args) {
    WebDriver driver = DriverFactory.getWebDriver();
    // Open web page
    driver.get("https://sdetpro.com");
    // Close the window
    driver.close();
    //Quit the session
    driver.quit();
  }
}
