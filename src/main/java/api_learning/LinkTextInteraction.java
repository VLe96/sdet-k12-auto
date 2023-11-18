  package api_learning;

  import driver.DriverFactory;
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;

  public class LinkTextInteraction {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
  private static final By userNameSel = By.tagName("input");
  private static final By clickButtonSel = By.cssSelector("#login [type='submit']");
  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
    //  By powerByLinktextSel = By.linkText("Elemental Selenium");
      By powerPảtyAllLinktextSel = By.partialLinkText("Elemental");
      WebElement powerByLinktextElm = driver.findElement(powerPảtyAllLinktextSel);
      powerByLinktextElm.click();

      try{
        Thread.sleep(2000);
      }catch (Exception ignored){
        }
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}
