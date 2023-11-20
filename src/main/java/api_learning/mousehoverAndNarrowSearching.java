package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.NoSuchElementException;

public class mousehoverAndNarrowSearching {
  private static final String TARGET_URL = "https://the-internet.herokuapp.com/hovers";
  private static final By FIGURE_SEL = By.cssSelector(".figure");
  private static final By PROFILE_NAME_SEL = By.cssSelector(".figcaption h5");
  private static final By PROFILE_LINK_SEL = By.cssSelector(".figcaption a");

  public static void main(String[] args) {
    WebDriver driver =  DriverFactory.getWebDriver();
    driver.get(TARGET_URL);
    try{
      /*
      * Searching globally - mean from html tag
      * driver.findElement/s(locator)
      *
      *
      * Narow down searching scope with the parent scope is now the element
      * WebElement.findElement
      * */

      // target parent element
      List<WebElement> figureEles = driver.findElements(FIGURE_SEL);
      if(figureEles.isEmpty()){
        throw new NoSuchElementException("No figures on the page");
      }

      //mouse hover action
      Actions actions = new Actions(driver);
      for (WebElement figureEle : figureEles) {
        WebElement profileNameEle = figureEle.findElement(PROFILE_NAME_SEL);
        WebElement profileLinkEle = figureEle.findElement(PROFILE_LINK_SEL);
        boolean figureName = figureEle.findElement(PROFILE_NAME_SEL).isDisplayed();
        boolean figureLink = figureEle.findElement(PROFILE_LINK_SEL).isDisplayed();
        System.out.println("figureName: " + figureName);
        System.out.println("figureLink: " + figureLink);

        actions.moveToElement(figureEle).perform();
        profileNameEle = figureEle.findElement(PROFILE_NAME_SEL);
        profileLinkEle = figureEle.findElement(PROFILE_LINK_SEL);
        System.out.println("Profile name: " + profileNameEle.getText());
        System.out.println("Profile link: " + profileLinkEle.getAttribute("href"));
        figureName = figureEle.findElement(PROFILE_NAME_SEL).isDisplayed();
        figureLink = figureEle.findElement(PROFILE_LINK_SEL).isDisplayed();
        System.out.println("figureName: " + figureName);
        System.out.println("figureLink: " + figureLink);
        Thread.sleep(3000);
        System.out.println("\n");
      }

    }catch(Exception ignore){
      ignore.printStackTrace();
    }finally{
      driver.quit();
    }
  }
}


