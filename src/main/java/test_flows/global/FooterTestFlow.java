package test_flows.global;

import model.components.Global.footer.FooterColumnComponent;
import model.components.Global.footer.InformationColumnComponent;
import model.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterTestFlow {
    private final WebDriver driver;

    public FooterTestFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyFooterComponent(){
        BasePage basePage = new BasePage(this.driver);
        InformationColumnComponent informationColumnComponent = basePage.footerComponent().informationColumnComponent();
        verifyInformationColumn(informationColumnComponent);
        verifyCustomerServiveColumn(informationColumnComponent);
        verifyMyAccountColumn();
        verifyFollowUsColumn();
    }

    private void verifyInformationColumn(InformationColumnComponent informationColumnComponent) {
    }

    private void verifyCustomerServiveColumn(InformationColumnComponent informationColumnComponent) {
    }

    private void verifyMyAccountColumn() {
    }

    private void verifyFollowUsColumn() {
    }


    private void testFooterColumn(FooterColumnComponent footerColumnComponent){
        System.out.println(footerColumnComponent.headerElement().getText());
        for (WebElement linkEle : footerColumnComponent.linkElement()) {
            System.out.println(linkEle.getText() + ": " + linkEle.getAttribute("href"));
        }
    }


}
