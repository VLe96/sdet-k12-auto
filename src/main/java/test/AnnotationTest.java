package test;

import model.components.FindComponent;
import model.components.FooterComponent;

public class AnnotationTest {
    public static void main(String[] args) {
        String footerSompSel = new FindComponent().getComponentCssSelector(FooterComponent.class);
        System.out.println(footerSompSel);
    }
}
