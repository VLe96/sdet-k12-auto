  package api_learning;

  import driver.DriverFactory;
  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;

  public class GettingAttributeValue {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/login";
  private static final By userNameSel = By.tagName("input");
  private static final By clickButtonSel = By.cssSelector("#login [type='submit']");
  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
    //  By powerByLinktextSel = By.linkText("Elemental Selenium");
      By powerPartyAllLinktextSel = By.partialLinkText("Elemental");
      System.out.println(driver.findElement(powerPartyAllLinktextSel).getAttribute("target"));
    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}
